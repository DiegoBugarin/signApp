package diego.estrada.deersign

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class subCategorias (
    val nombre: String,
    val color: String,
    val grupoVideos: MutableList<word>
    ): Parcelable