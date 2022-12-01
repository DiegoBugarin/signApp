package diego.estrada.deersign

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import diego.estrada.deersign.databinding.ItemCategoriaBinding

//Adaptador de diccionario para desplegar las categorías en el RecyclerView
class dictionaryAdapter(var context: Context, var data:List<category>,private val funcionX: (category) ->Unit) : RecyclerView.Adapter<dictionaryAdapter.ViewHolder>() {
    //context: Contexto del fragmento
    //data: La lista de categorías a desplegar

    class ViewHolder(val binding: ItemCategoriaBinding, funcionZ: (Int) -> Unit) : RecyclerView.ViewHolder(binding.root){
        init {
            //Permitir el click sobre la categoría y enviar su posición (qué categoría es)
            itemView.setOnClickListener {
                funcionZ(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCategoriaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        //Mandar la información de la categoría [it]
        return ViewHolder(view) {
            funcionX(data[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Agregar el nombre, ícono y color al apartado de la categoría
        holder.binding.apply {
            imageView.setImageResource(data[position].icono)
            textView.text = data[position].nombre
            root.setCardBackgroundColor(Color.parseColor(data[position].color))
        }
    }

    //Tamaño de la lista de categorías
    override fun getItemCount(): Int {
        return data.size
    }
}