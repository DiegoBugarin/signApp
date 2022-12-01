package diego.estrada.deersign

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
    var mAuth = FirebaseAuth.getInstance()
    var dataBase = FirebaseDatabase.getInstance().getReference()
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

        Log.i("Guest in profile", user?.isAnonymous.toString())
        user?.let { Log.i("Uid in profile", it.uid) }

        if(user?.isAnonymous == true){
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

            dataBase.child("Guests").child("Users").child(user!!.uid).child("username").get().addOnSuccessListener {
                if(it.value != null){
                val username = it.value
                    Log.i("Username", username as String)
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
            activity?.recreate()
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }

        binding.btnEdit.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_editFragment)
        }

        binding.btnSecurity.setOnClickListener {
            if(!user?.isAnonymous!!){
                findNavController().navigate(R.id.action_profileFragment_to_passwordFragment)
            }

            else{
                Toast.makeText(context, "El usuario es invitado", Toast.LENGTH_LONG).show()
                Log.i("User", "Es invitado")
            }
        }

    }

}