package diego.estrada.deersign

import kotlin.jvm.internal.Intrinsics
import kotlin.properties.Delegates

data class Guest(
    var company: String? = null,
    var progreso: Int? = 0,
    var username: String? = null){

}