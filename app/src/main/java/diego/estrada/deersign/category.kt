package diego.estrada.deersign

import android.graphics.Color
import android.graphics.drawable.Icon
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class category (
    val nombre: String,
    val icono: Int,
    val color: String,
    val subcat: MutableList<subCategorias>,
    val words: MutableList<word>,
    val size: Int
        ): Parcelable