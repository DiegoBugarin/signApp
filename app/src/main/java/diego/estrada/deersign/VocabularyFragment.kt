package diego.estrada.deersign

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.SearchView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import diego.estrada.deersign.databinding.FragmentVocabularyBinding
import java.util.Locale.filter

//Fragmento del vocabulario de una categoría
class VocabularyFragment : Fragment() {
    private var _binding: FragmentVocabularyBinding? = null
    private val binding get() = _binding!!
    lateinit var wordList: MutableList<word> //Lista con las palabras de una categoría
    lateinit var vocbularyRVAdapter: vocabularyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVocabularyBinding.inflate(inflater, container, false)

        wordList = ArrayList<word>().toMutableList()
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val categoria = it.get("categoria") as category //Extraer la categoría del bundle
            wordList = categoria.words //Extraer las palabras de la categoría
            //Cambiar el color del toolbar y el texto al de la categoría
            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)

            //Adaptador de las palabras para el recyclerview
            val adaptercategoria =
                vocabularyAdapter(requireActivity(), categoria.words) {
                    val bundle = Bundle()
                    bundle.putParcelable("palabra", it) //Poner en bundle la palabra seleccionada
                    bundle.putParcelable("categoria", categoria) //Poner en bundle la categoría seleccionada
                    //Ir al fragmento de la palabra
                    Navigation.findNavController(view).navigate(R.id.action_vocabularyFragment_to_wordFragment,bundle)
                }

            //Asignar la decoración del recyclerview
            binding.rvsubcat.addItemDecoration(
                DividerItemDecoration(
                    activity,
                    LinearLayoutManager.VERTICAL
                )
            )

            //Asignar el adaptador al RecyclerView
            binding.rvsubcat.adapter = adaptercategoria
            binding.rvsubcat.layoutManager = LinearLayoutManager(requireActivity())

            val bundle = Bundle()

            //Botón para regresar al fragmento del diccionario
            binding.backBtn.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_vocabularyFragment_to_dictionaryFragment,bundle)
            }
        }
    }

}