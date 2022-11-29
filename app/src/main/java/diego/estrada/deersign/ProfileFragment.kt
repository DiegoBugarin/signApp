package diego.estrada.deersign

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.FragmentLoginBinding
import diego.estrada.deersign.databinding.FragmentProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding?= null
    private val binding get() = _binding!!
    val mAuth = FirebaseAuth.getInstance()
    val dataBase = FirebaseDatabase.getInstance().getReference()
    var user = mAuth.currentUser;
    lateinit var ref : String
    lateinit var savedUser : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val sharedPref = activity?.getSharedPreferences("prefs", Activity.MODE_PRIVATE)
        val editor = sharedPref?.edit()
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        if(user?.isAnonymous == true){
            dataBase.child("Guests").child("Users").child(user!!.uid).child("progreso").get().addOnSuccessListener {

                if(it.value != null){
                    val prog = it.value
                    binding.progressBar.progress = (prog as Long).toInt()
                }
            }

            dataBase.child("Guests").child("Users").child(user!!.uid).child("username").get().addOnSuccessListener {
                if(it.value != null){
                val username = it.value
                binding.usuario.setText(username as String)
                }
            }
        }
        else if(user != null){

            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("progreso").get().addOnSuccessListener {
                val prog = it.value
                binding.progressBar.progress = (prog as Long).toInt()
            }

            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("username").get().addOnSuccessListener {
                val username = it.value
                binding.usuario.setText(username as String)
            }
        }



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPref = activity?.getSharedPreferences("prefs", Activity.MODE_PRIVATE)
        val editor = sharedPref?.edit()

        binding.btnExit.setOnClickListener{
            mAuth.signOut()
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }

        binding.btnEdit.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_editFragment)
        }

    }

}