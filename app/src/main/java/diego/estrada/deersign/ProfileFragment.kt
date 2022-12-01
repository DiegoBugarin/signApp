package diego.estrada.deersign

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent.getIntent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.FragmentProfileBinding
import java.util.*

//Fragmento para ver el perfil del usuario
class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding?= null
    private val binding get() = _binding!!
    var mAuth = FirebaseAuth.getInstance()
    var dataBase = FirebaseDatabase.getInstance().getReference()
    var user = mAuth.currentUser;
    lateinit var ref : String
    lateinit var savedUser : String

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        Log.i("Guest in profile", user?.isAnonymous.toString())
        user?.let { Log.i("Uid in profile", it.uid) }

        //El usuario es invitado
        if(user?.isAnonymous == true){
            //Obtener el progreso del usuario de la base de datos y ponerlo en la barra de progreso
            dataBase.child("Guests").child("Users").child(user!!.uid).child("progreso").get().addOnSuccessListener {
                if(it.value == 0){
                    val prog = it.value
                    binding.progressBar.progress = (prog as Long).toInt()
                }

                else if(it.value != null){
                    val prog = it.value
                    binding.progressBar.progress = (prog as Long).toInt()
                }
            }

            //Extraer el nombre de usuario de la base de datos y desplegarlo
            dataBase.child("Guests").child("Users").child(user!!.uid).child("username").get().addOnSuccessListener {
                if(it.value != null){
                val username = it.value
                    Log.i("Username", username as String)
                binding.usuario.setText(username as String)
                }
            }
        }

        //El usuario es de la institución
        else if(user != null){

            //Extraer el progreso del usuario de la base de datos
            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("progreso").get().addOnSuccessListener {
                val prog = it.value
                binding.progressBar.progress = (prog as Long).toInt()
            }

            //Extraer el nombre de usuario de la base de datos
            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("username").get().addOnSuccessListener {
                val username = it.value
                binding.usuario.setText(username as String)
            }
        }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Botón de salir de sesión
        binding.btnExit.setOnClickListener{
            //Cerrar sesión del usuario en FireBase
            mAuth.signOut()
            activity?.recreate()
            //Navegar a la pantalla de inicio
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }

        //Botón para editar la información del usuario
        binding.btnEdit.setOnClickListener {
            //Ir a la pantalla de edición
            findNavController().navigate(R.id.action_profileFragment_to_editFragment)
        }

        //Botón de seguridad para cambiar de contraseña
        binding.btnSecurity.setOnClickListener {
            //El usuario es de la institución
            if(!user?.isAnonymous!!){
                //Ir a la pantalla de cambio de contraseña
                findNavController().navigate(R.id.action_profileFragment_to_passwordFragment)
            }

            //El usuario es invitado
            else{
                //Desplegar mensaje que el usuario es invitado
                Toast.makeText(context, "El usuario es invitado", Toast.LENGTH_LONG).show()
                Log.i("User", "Es invitado")
            }
        }

    }

}