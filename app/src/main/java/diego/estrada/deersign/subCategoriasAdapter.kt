package diego.estrada.deersign

import android.content.Context
import android.graphics.Color
import android.opengl.Visibility
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.ItemCategoriaBinding
import diego.estrada.deersign.databinding.ItemSubCategoriaBinding
import diego.estrada.deersign.databinding.ItemWordBinding
import java.util.Locale.Category

//Adaptador para desplegar las subcategorías
class subCategoriasAdapter(var context: Context, var cat: category, var data: List<subCategorias>, val funcionX: (subCategorias) ->Unit) : RecyclerView.Adapter<subCategoriasAdapter.ViewHolder>() {
    //cat: Categoría seleccionada
    //data: Lista de subcategorías de la categoría

    val dataBase = FirebaseDatabase.getInstance().getReference() //Referencia a la base de datos
    val mAuth = FirebaseAuth.getInstance() //Instancia de la autentificación
    var user = mAuth.currentUser; //Usuario logeado

    lateinit var subCat: subCategorias
    class ViewHolder (val binding: ItemSubCategoriaBinding, funcionZ: (Int) -> Unit) : RecyclerView.ViewHolder(binding.root)  {
        //Registrando el evento de click y retornando una funcion con el indice del elemento
        init {
            itemView.setOnClickListener {
                funcionZ(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemSubCategoriaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view) {
            funcionX(data[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Log.i("name", data[position].nombre)
        //Actualizar los valores del nombre, ícono y color de la subcategoría
        holder.binding.apply {
            imageView.setImageResource(cat.icono)
            textView.setText(data[position].nombre)
            root.setCardBackgroundColor(Color.parseColor(cat.color))
        }

        //El usuario es invitado
        if(user?.isAnonymous == true){
            //Revisar si el usuario completó la subcategoría en la base de datos
            dataBase.child("Guests").child("Categorias").child(cat.nombre).child(data[position].nombre).child(
                user!!.uid).get().addOnSuccessListener {
                if(it.value != null){
                    val complete = it.value
                    //Si la subcategoría ya se completó, desplegar la palomita
                    if(complete as Boolean){
                        holder.binding.imageView3.visibility = View.VISIBLE
                    }
                }

            }
        }

        //El usuario es de la institución
        else if(user != null){
            //Saber si la subcategoría ya la completó
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(data[position].nombre).child(
                user!!.uid).get().addOnSuccessListener {
                    val complete = it.value
                //Si ya la completó desplegar la palomita
                    if(complete as Boolean){
                        holder.binding.imageView3.visibility = View.VISIBLE
                    }
            }
        }

    }

    //Obtener el tamaño de la lista de subcategorías
    override fun getItemCount(): Int {
        return data.size
    }

}


