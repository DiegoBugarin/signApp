package diego.estrada.deersign

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.ActivityMainBinding.inflate
import diego.estrada.deersign.databinding.FragmentEditBinding
import diego.estrada.deersign.databinding.FragmentHomeBinding
import diego.estrada.deersign.databinding.FragmentLoginBinding
import diego.estrada.deersign.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding?= null
    private val binding get() = _binding!!
    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;
    var password = ""
    var password2 = ""

    internal fun isValidPassword(): Boolean {
        if (password.length < 8) return false
        if (password.filter { it.isDigit() }.firstOrNull() == null) return false
        if (password.filter { it.isLetter() }.filter { it.isUpperCase() }.firstOrNull() == null) return false
        if (password.filter { it.isLetter() }.filter { it.isLowerCase() }.firstOrNull() == null) return false
        if (password.filter { !it.isLetterOrDigit() }.firstOrNull() == null) return false

        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonUpdate.setOnClickListener(){
            password = binding.password.text.toString()
            password2 = binding.password2.text.toString()
            if(password == password2 && isValidPassword()){
                user?.updatePassword(password)
                Toast.makeText(context, "Contraseña actualizada", Toast.LENGTH_LONG).show()
                Log.i("Password", "Contraseña actualizada")
            }

            else if(password != password2){
                Toast.makeText(context, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show()
                Log.i("Password", "No coinciden")
            }

            else{
                Toast.makeText(context, "La contraseña no es segura", Toast.LENGTH_LONG).show()
                Log.i("Password", "No es seguro")
            }
        }

        binding.backBtn.setOnClickListener{
            findNavController().navigate(R.id.action_passwordFragment_to_profileFragment)
        }

    }
}
