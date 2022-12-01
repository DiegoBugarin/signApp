package diego.estrada.deersign

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Clase de palabra
@Parcelize
data class word (
    val nombre: String, //Nombre de palabra
    val source_path: Int? //Origen del video desde drawable
): Parcelable