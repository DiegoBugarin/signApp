package diego.estrada.deersign

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.SharedPreferences
  import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.FragmentHomeBinding
import diego.estrada.deersign.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding?= null
    private val binding get() = _binding!!
    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (user != null) {
            Log.i("Login", "Conectado")
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment2)
            // User is signed in.
        } else {
            Log.i("Login,", "No User")
            // No user is signed in.
        }

        binding.buttonEntrar.setOnClickListener{
            Log.i("correo", binding.email.editText?.text.toString())
            if(binding.email.editText?.text.toString().isNotEmpty() && binding.password.editText?.text.toString().isNotEmpty()){
                mAuth.signInWithEmailAndPassword(binding.email.editText?.text.toString(), binding.password.editText?.text.toString()).addOnCompleteListener {
                    if(it.isSuccessful){
                        findNavController().navigate(R.id.action_loginFragment_to_homeFragment2)
                        user?.let { it1 -> Log.i("UserUid", it1.uid) }
                    }

                    else{
                        showAlert()
                    }
                }
            }
        }

        binding.buttonGuest.setOnClickListener{
            mAuth.signInAnonymously().addOnCompleteListener {

                if(it.isSuccessful){
                    addGuest()
                    Log.i("Guest", user?.isAnonymous.toString())
                    user?.let { it1 -> Log.i("Guest", it1.uid) }
                    findNavController().navigate(R.id.action_loginFragment_to_homeFragment2)
                }
                else{
                    showGuestAlert()
                }
            }
        }
    }

    fun showAlert(){
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Error")
        builder.setMessage("Verifique que el correo y contraseña sean correctos.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showGuestAlert(){
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Error")
        builder.setMessage("No se logró ingresar como invitado.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun addGuest(){
        val guest = Guest("Guest", 0, "Guest")
        user?.let { Log.i("UserID add Guest", it.uid) }
        user?.let {
            dataBase.child("Guests").child("Users").child(user!!.uid).setValue(guest)
            dataBase.child("Guests").child("Categorias").child("ABC").child("ABC I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ABC").child("ABC II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ABC").child("ABC III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ABC").child("ABC IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ABC").child("ABC V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ABC").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("ANIMALES I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("ANIMALES II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("ANIMALES III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("ANIMALES IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("ANIMALES V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ANIMALES").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("COLORES").child("COLORES I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COLORES").child("COLORES II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COLORES").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("COMIDA VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("COMIDA").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("CUERPO").child("CUERPO I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("CUERPO").child("CUERPO II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("CUERPO").child("CUERPO III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("CUERPO").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("DIAS").child("DIAS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("DIAS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("FRUTAS").child("FRUTAS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("FRUTAS").child("FRUTAS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("FRUTAS").child("FRUTAS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("FRUTAS").child("FRUTAS IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("FRUTAS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("HOGAR I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("HOGAR II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("HOGAR III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("HOGAR IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("HOGAR V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("HOGAR").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("LUGARES").child("LUGARES I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("LUGARES").child("LUGARES II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("LUGARES").child("LUGARES III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("LUGARES").child("LUGARES IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("LUGARES").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("MESES").child("MESES I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("MESES").child("MESES II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("MESES").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO VII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("NUMERO VIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("NUMERO").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS VII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS VIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS IX").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS X").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS XI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS XII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("PERSONAS XIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PERSONAS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("PREGUNTAS").child("PREGUNTAS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREGUNTAS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP VII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP VIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP IX").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP X").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XIV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XVI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XVII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("PREP XVIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PREP").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("PRONOMBRES").child("PRONOMBRES I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("PRONOMBRES").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("OFICIOS VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("OFICIOS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("ROPA").child("ROPA I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ROPA").child("ROPA II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("ROPA").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("SALUDOS").child("SALUDOS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("SALUDOS").child("SALUDOS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("SALUDOS").child("SALUDOS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("SALUDOS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO VII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("TIEMPO VIII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TIEMPO").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("TRANSPORTE").child("TRANSPORTE I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TRANSPORTE").child("TRANSPORTE II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("TRANSPORTE").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS IV").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS V").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS VI").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS VII").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("VERBOS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERBOS").child("progress").child(user!!.uid).setValue(0);
            dataBase.child("Guests").child("Categorias").child("VERDURAS").child("VERDURAS I").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERDURAS").child("VERDURAS II").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERDURAS").child("VERDURAS III").child(user!!.uid).setValue(false);
            dataBase.child("Guests").child("Categorias").child("VERDURAS").child("progress").child(user!!.uid).setValue(0);
        }
    }


}