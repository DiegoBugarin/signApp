package diego.estrada.deersign

import com.google.firebase.database.DataSnapshot

class User(snapshot: DataSnapshot){
    lateinit var apellido: String
    lateinit var companyArea: String
    lateinit var correo: String
    lateinit var nombre: String
    var progreso: Long = 0
    lateinit var userN: String

    init{
            val data: HashMap<String, Any> = snapshot.value as HashMap<String, Any>
            apellido = data["apellido"] as String
            companyArea = data["area"] as String
            correo = data["email"] as String
            nombre = data["nombre"] as String
            progreso = data["progreso"] as Long
            userN = data["username"] as String
        }
    }

