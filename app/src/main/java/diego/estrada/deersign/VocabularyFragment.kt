package diego.estrada.deersign

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import diego.estrada.deersign.databinding.FragmentVocabularyBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [VocabularyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VocabularyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentVocabularyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVocabularyBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val categoria = it.get("categoria") as category
            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)

            val adaptercategoria =
                vocabularyAdapter(requireActivity(), categoria.words) {
                    val bundle = Bundle()
                    bundle.putParcelable("palabra", it)
                    bundle.putParcelable("categoria", categoria)
                    Navigation.findNavController(view).navigate(R.id.action_vocabularyFragment_to_wordFragment,bundle)
                }

            binding.rvsubcat.addItemDecoration(
                DividerItemDecoration(
                    activity,
                    LinearLayoutManager.VERTICAL
                )
            )
            binding.rvsubcat.adapter = adaptercategoria
            binding.rvsubcat.layoutManager = LinearLayoutManager(requireActivity())

            val bundle = Bundle()
            binding.backBtn.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_vocabularyFragment_to_dictionaryFragment,bundle)
            }
        }
    }

}