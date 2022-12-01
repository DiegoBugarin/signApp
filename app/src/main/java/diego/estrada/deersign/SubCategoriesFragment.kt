package diego.estrada.deersign

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import diego.estrada.deersign.databinding.FragmentHomeBinding
import diego.estrada.deersign.databinding.FragmentSubCategoriesBinding

class SubCategoriesFragment : Fragment() {
    private var _binding: FragmentSubCategoriesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            //Obtener la categoría seleccionada del bundle
            val categoria = it.get("categoria") as category

            //Actualizar el color del toolbar y el texto al de la categoría
            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)

            //Asignar el adaptador de la subcategoría
            val subCatAdapter =
                subCategoriasAdapter(requireActivity(), categoria, categoria.subcat) {
                    val bundle = Bundle()
                    bundle.putParcelable("categoria", categoria) //Poner en bundle la categoría
                    bundle.putParcelable("subCat", it) //Poner en bundle la subcategoría seleccionada
                    //Navegar al fragmento de quiz
                    Navigation.findNavController(view)
                        .navigate(R.id.action_subCategoriesFragment_to_quizFragment, bundle)
                }

            //Botón para regresar al fragmento de Home
            binding.backBtn.setOnClickListener {
                Navigation.findNavController(view)
                    .navigate(R.id.action_subCategoriesFragment_to_homeFragment)
            }

            //Asignar el adaptador en el recyclerview
            binding.rvsubcat.adapter = subCatAdapter

            //Crear el grid de una columna
            binding.rvsubcat.layoutManager =
                GridLayoutManager(requireActivity(), 1, RecyclerView.VERTICAL, false)
        }
    }
}