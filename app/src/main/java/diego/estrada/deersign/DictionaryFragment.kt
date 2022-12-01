package diego.estrada.deersign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import diego.estrada.deersign.databinding.FragmentDictionaryBinding

//Fragmento de diccionario
class DictionaryFragment : Fragment() {

    private var _binding: FragmentDictionaryBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDictionaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Adaptador para desplegar las categorías en el RecyclerView mandando módulosLista
        val adaptercategoria = dictionaryAdapter(requireActivity(), modulosLista){
            val bundle = Bundle()
            //Enviar la categoría seleccionada en caso de darle click y enviar al apartado de vocabulario
            bundle.putParcelable("categoria",it)
            Navigation.findNavController(view).navigate(R.id.action_dictionaryFragment_to_vocabularyFragment,bundle)
        }

        //Asignar el adaptador de adaptercategoria en el RecyclerView
        binding.rvmodulos.adapter = adaptercategoria
        binding.rvmodulos.layoutManager = GridLayoutManager(requireActivity(), 2, RecyclerView.VERTICAL, false)
    }

}