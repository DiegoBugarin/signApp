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

//Fragmento de los módulos de aprendizaje (Home Fragment)
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding ?= null
    private val binding get() = _binding!!
    val dataBase = FirebaseDatabase.getInstance().getReference() //Referencia a la base de datos
    val mAuth = FirebaseAuth.getInstance() //Instancia de la autentificación en FB
    var user = mAuth.currentUser; //Usuario actual
    lateinit var ref : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        //Extraer progreso de usuario anónimo desde FireBase
        if(user?.isAnonymous == true){
            dataBase.child("Guests").child("Users").child(user!!.uid).child("progreso").get().addOnSuccessListener {
                if(it.value != null){
                    val prog = it.value as Long
                    binding.progressBar2.progress = (prog).toInt()
                }
            }
        }

        //Extraer progreso de usuario de la institución
        else if(user != null){
            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("progreso").get().addOnSuccessListener {
                val prog = it.value
                binding.progressBar2.progress = (prog as Long).toInt()
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Asignar a adaptercategoria los módulos de categoría para el recyclerview, mandando la lista de modulos
        val adaptercategoria = homeAdapter(requireActivity(), modulosLista){
            val bundle = Bundle()
            //Enviar la información de la categoria seleccionada a subcategorias
            bundle.putParcelable("categoria",it)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_subCategoriesFragment,bundle)
        }

        //Asignar el adaptador al Recycler View para desplegar las categorias
        binding.rvmodulos.adapter = adaptercategoria
        //Mostrar las categorías en dos columnas
        binding.rvmodulos.layoutManager = GridLayoutManager(requireActivity(), 2, RecyclerView.VERTICAL, false)
    }

}