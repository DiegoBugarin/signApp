package diego.estrada.deersign

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Clase de subcategorías
@Parcelize
data class subCategorias (
    val nombre: String, //Nombre de la subcategoría
    val color: String, //Valor del color de fondo
    val grupoVideos: MutableList<word> //Lista de palabras pertenecientes a la subcategoría
    ): Parcelable