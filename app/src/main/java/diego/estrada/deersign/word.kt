package diego.estrada.deersign

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class word (
    val nombre: String,
    val source_path: String
):Parcelable