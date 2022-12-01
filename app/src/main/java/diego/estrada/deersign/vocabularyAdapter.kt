package diego.estrada.deersign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import diego.estrada.deersign.databinding.ItemWordBinding

//Adaptador para el despliegue de palabras
class vocabularyAdapter (var context: Context, var data: List<word>, private val funcionX: (word) ->Unit) : RecyclerView.Adapter<vocabularyAdapter.ViewHolder>(){
    //data: Lista de palabras de una categoría

    //Intento de buscador de palabras
    var wordList = data
    fun setFilteredList(filteredList: MutableList<word>){
        wordList = filteredList
        notifyDataSetChanged()
    }

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
            funcionX(wordList[it])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Colocar el nombre de la palabra en el item
        holder.binding.apply {
            textView.text = wordList[position].nombre
        }
    }

    //Obtener el tamaño de la lista de palabras
    override fun getItemCount(): Int {
        return wordList.size
    }

}