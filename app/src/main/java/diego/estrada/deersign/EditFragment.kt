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
    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;
    var username: String = ""
    var correo : String = ""
    var empresa : String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditBinding.inflate(inflater, container, false)

        if(user?.isAnonymous == true){
            dataBase.child("Guests").child("Users").child(user!!.uid).child("username").get().addOnSuccessListener {
                if(it.value != null){
                    username = it.value as String
                    binding.usuario.setText(username)
                }
            }
            binding.empresa.setText("Guest")
            binding.empresa.setText("Guest")
        }

        else if(user != null) {
            setUserValues()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_editFragment_to_profileFragment)
        }

        binding.buttonUpdate.setOnClickListener(){
            username = binding.usuario.text.toString()

            if(user?.isAnonymous == true) {
                dataBase.child("Guests").child("Users").child(user!!.uid).child("username").setValue(username)
            }

            else if(user != null) {
                dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("username").setValue(username)
            }

            Toast.makeText(context, "Usuario actualizado", Toast.LENGTH_LONG).show()

        }
    }

    fun setUserValues(){
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values to update the UI
                if(dataSnapshot != null){
                    val user : User = User(dataSnapshot)
                    if (user != null) {
                        binding.usuario.setText(user.userN)
                        binding.empresa.setText("John Deere")
                        binding.correo.setText(user.correo)
                    }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
            }
        }
        dataBase.child("John Deere").child("Empleados").child(user!!.uid).addValueEventListener(postListener)
    }

}