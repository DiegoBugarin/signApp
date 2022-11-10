package diego.estrada.deersign

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import diego.estrada.deersign.databinding.ItemCategoriaBinding
import diego.estrada.deersign.databinding.ItemSubCategoriaBinding
import java.util.Locale.Category

class subCategoriasAdapter(var cat: category) : RecyclerView.Adapter<subCategoriasAdapter.ViewHolder>() {

    lateinit var context: Context
    var data: List<subCategorias> = cat.subcat
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

