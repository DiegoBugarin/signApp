package diego.estrada.deersign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import diego.estrada.deersign.databinding.ItemWordBinding

class vocabularyAdapter (var context: Context, var data: List<word>, private val funcionX: (word) ->Unit) : RecyclerView.Adapter<vocabularyAdapter.ViewHolder>(){

    class ViewHolder (val binding: ItemWordBinding, funcionZ: (Int) -> Unit) : RecyclerView.ViewHolder(binding.root)  {


        //Registrando el evento de click y retornando una funcion con el indice del elemento
        init {
            itemView.setOnClickListener {
                funcionZ(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemWordBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view) {
            funcionX(data[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textView.text = data[position].nombre
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}