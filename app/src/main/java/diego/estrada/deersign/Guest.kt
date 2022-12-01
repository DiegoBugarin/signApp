package diego.estrada.deersign

import kotlin.jvm.internal.Intrinsics
import kotlin.properties.Delegates

//Clase Guest para almacenar la información del invitado
data class Guest(
    var company: String? = null, //Nombre de compañía
    var progreso: Int? = 0, //Progreso de aprendizaje
    var username: String? = null){ //Nombre de usuario

}