package diego.estrada.deersign

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import diego.estrada.deersign.databinding.ItemCategoriaBinding

//Adaptador para desplegar las categorías en el módulo de aprendizaje
class homeAdapter(var context: Context, var data:List<category>,private val funcionX: (category) ->Unit) : RecyclerView.Adapter<homeAdapter.ViewHolder>() {
    //data: Lista con las categorías

    class ViewHolder (val binding: ItemCategoriaBinding, funcionZ: (Int) -> Unit) : RecyclerView.ViewHolder(binding.root)  {
        //Registrando el evento de click y retornando una funcion con el indice del elemento
        init {
            itemView.setOnClickListener {
                funcionZ(adapterPosition)
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCategoriaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        //Enviar la información de la categoría en la posición [it]
        return ViewHolder(view) {
            funcionX(data[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Agregar la información de la categoría al bloque correspondiente
        holder.binding.apply {
            imageView.setImageResource(data[position].icono)
            textView.text = data[position].nombre
            root.setCardBackgroundColor(Color.parseColor(data[position].color))
        }

        Glide.with(context)
            .load(data[position].icono)
            .into(holder.binding.imageView)
    }

    //Contador de categorías en data
    override fun getItemCount(): Int {
        return data.size
    }

}