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

class subCategoriasAdapter(var context: Context, var cat: category, var data: List<subCategorias>, val funcionX: (subCategorias) ->Unit) : RecyclerView.Adapter<subCategoriasAdapter.ViewHolder>() {

    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;

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
        holder.binding.apply {
            imageView.setImageResource(cat.icono)
            textView.setText(data[position].nombre)
            root.setCardBackgroundColor(Color.parseColor(cat.color))
        }
        if(user != null){
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(data[position].nombre).child(
                user!!.uid).get().addOnSuccessListener {
                    val complete = it.value
                    if(complete as Boolean){
                        holder.binding.imageView3.visibility = View.VISIBLE
                    }
            }
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}
/*
class subCategoriasAdapter(var data:List<subCategorias>, var cat: category) : RecyclerView.Adapter<subCategoriasAdapter.ViewHolder>() {

    lateinit var context: Context
    class ViewHolder(val binding: ItemSubCategoriaBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemSubCategoriaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            imageView.setImageResource(cat.icono)
            textView.text = data[position].nombre
            root.setCardBackgroundColor(Color.parseColor(data[position].color))
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}*/

