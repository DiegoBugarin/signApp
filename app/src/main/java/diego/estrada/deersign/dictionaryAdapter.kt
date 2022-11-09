package diego.estrada.deersign

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import diego.estrada.deersign.databinding.ItemCategoriaBinding

class dictionaryAdapter(var data:List<category>) : RecyclerView.Adapter<dictionaryAdapter.ViewHolder>() {
    lateinit var context: Context
    class ViewHolder(val binding: ItemCategoriaBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemCategoriaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            imageView.setImageResource(data[position].icono)
            textView.text = data[position].nombre
            root.setCardBackgroundColor(Color.parseColor(data[position].color))
        }

        Glide.with(context)
            .load(data[position].icono)
            .into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}