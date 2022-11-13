package diego.estrada.deersign

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import diego.estrada.deersign.databinding.FragmentHomeBinding
import diego.estrada.deersign.databinding.FragmentSubCategoriesBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SubCategoriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubCategoriesFragment : Fragment() {
    private var _binding: FragmentSubCategoriesBinding?= null
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

        arguments?.let{
            val categoria = it.get("categoria") as category

            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)
            binding.back.setOnClickListener{
                Navigation.findNavController(view).navigate(R.id.action_subCategoriesFragment_to_homeFragment)
            }

            val adapterCategoria =
                subCategoriasAdapter(requireActivity(), categoria.subcat, categoria) {
                    val bundle = Bundle()
                    bundle.putParcelable("subCategoria", it)
                    Navigation.findNavController(view).navigate(R.id.action_subCategoriesFragment_to_quizFragment,bundle)
                }
            binding.rvsubcat.addItemDecoration( DividerItemDecoration(activity, LinearLayoutManager.VERTICAL))
            binding.rvsubcat.adapter = adapterCategoria
            binding.rvsubcat.layoutManager = GridLayoutManager(requireActivity(), 1, RecyclerView.VERTICAL, false)

        }

    }
}