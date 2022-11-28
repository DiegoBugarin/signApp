package diego.estrada.deersign

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import diego.estrada.deersign.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding ?= null
    private val binding get() = _binding!!
    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;
    lateinit var ref : String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        if(user != null){

            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("avance").get().addOnSuccessListener {
                val prog = it.value
                //binding.progressBar2.progress = (prog as Long).toInt()
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adaptercategoria = homeAdapter(requireActivity(), modulosLista){
            val bundle = Bundle()
            bundle.putParcelable("categoria",it)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_subCategoriesFragment,bundle)
        }

        binding.rvmodulos.adapter = adaptercategoria
        binding.rvmodulos.layoutManager = GridLayoutManager(requireActivity(), 2, RecyclerView.VERTICAL, false)
    }

}