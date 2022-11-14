package diego.estrada.deersign

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class word (
    val nombre: String,
    val source_path: Int?
): Parcelable