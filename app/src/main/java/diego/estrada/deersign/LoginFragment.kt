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
                    }

                    else{
                        showAlert()
                    }
                }
            }
        }

        binding.buttonGuest.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment2)
        }
    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(context)
        builder.setTitle("Error")
        builder.setMessage("Verifique que el correo y contraseña sean correctos.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


}