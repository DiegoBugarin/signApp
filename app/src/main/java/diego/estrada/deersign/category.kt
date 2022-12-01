package diego.estrada.deersign

import android.graphics.Color
import android.graphics.drawable.Icon
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Clase categoría
@Parcelize
data class category (
    val nombre: String, //Nombre de la categoría
    val icono: Int, //Icono de la categoría asignado desde drawable
    val color: String, //HEX color de formato #AAAAAAA para la categoría
    val subcat: MutableList<subCategorias>, //Lista de subcategorías pertenecientes a la categoría
    val words: MutableList<word>, //Palabras que le pertenecen a la categoría
    val size: Int //Tamaño de subcategorías que lo conforman
        ): Parcelable