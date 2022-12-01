package diego.estrada.deersign

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import diego.estrada.deersign.databinding.FragmentDictionaryBinding
import diego.estrada.deersign.databinding.FragmentEditBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EditFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EditFragment : Fragment() {

    private var _binding: FragmentEditBinding?= null
    private val binding get() = _binding!!
    val dataBase = FirebaseDatabase.getInstance().getReference() //Referencia a FireBase
    val mAuth = FirebaseAuth.getInstance() //Instancia de la autentificación
    var user = mAuth.currentUser; //Obtener el usuario logeado
    var username: String = ""
    var correo : String = ""
    var empresa : String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditBinding.inflate(inflater, container, false)

        //Información a desplegar en caso de ser invitado
        if(user?.isAnonymous == true){

            //Desplegar el nombre de usuario de la base de datos
            dataBase.child("Guests").child("Users").child(user!!.uid).child("username").get().addOnSuccessListener {
                if(it.value != null){
                    username = it.value as String
                    binding.usuario.setText(username)
                }
            }

            //Desplegar la empresa y correo como "Guest"
            binding.empresa.setText("Guest")
            binding.correo.setText("Guest")
        }

        //Información a desplegar en caso de ser un usuario de la institución
        else if(user != null) {
            setUserValues()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Botón de regresar a la página de perfil
        binding.backBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_editFragment_to_profileFragment)
        }

        //Botón para actualizar el nombre de usuario
        binding.buttonUpdate.setOnClickListener(){
            username = binding.usuario.text.toString()

            //Actualizar el nombre de usuario para las cuentas de invitado
            if(user?.isAnonymous == true) {
                dataBase.child("Guests").child("Users").child(user!!.uid).child("username").setValue(username)
            }

            //Actualizar el nombre de usuario para las cuentas institucionales
            else if(user != null) {
                dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("username").setValue(username)
            }

            //Desplegar el mensaje de usuario actualizado
            Toast.makeText(context, "Usuario actualizado", Toast.LENGTH_LONG).show()

        }
    }

    //Función para asignar los valores en el UI de los usuarios de la institución
    fun setUserValues(){
        val postListener = object : ValueEventListener {
            //Extraer la información del usuario desde la base de datos como snapshot
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                //Asignar valores en caso de que el snapshot no sea nulo
                if(dataSnapshot != null){
                    //Asignar los valores del snapshot como tipo User a la variable user
                    val user : User = User(dataSnapshot)

                    //Asignar los valores del usuario a la UI
                    if (user != null) {
                        binding.usuario.setText(user.userN)
                        binding.empresa.setText("John Deere")
                        binding.correo.setText(user.correo)
                    }
                }
            }

            //En caso que haya un error en la base de datos
            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
            }
        }
        dataBase.child("John Deere").child("Empleados").child(user!!.uid).addValueEventListener(postListener)
    }

}