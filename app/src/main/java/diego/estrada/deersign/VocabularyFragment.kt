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
    lateinit var wordList: MutableList<word>
    lateinit var vocbularyRVAdapter: vocabularyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVocabularyBinding.inflate(inflater, container, false)

        wordList = ArrayList<word>().toMutableList()
        // Inflate the layout for this fragment
        binding.searchView.clearFocus()
        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.search_menu, menu)
        val searchItem: MenuItem = menu.findItem(R.id.actionSearch)
        val searchView: SearchView = searchItem.getActionView() as SearchView

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                Log.i("Search", "ha")
                return false
            }

            override fun onQueryTextChange(msg: String): Boolean {
                // inside on query text change method we are
                // calling a method to filter our recycler view.
                Log.i("Search", msg)
                filterList(msg)
                return false
            }
        })
    }

    private fun filterList(text: String) {
        var filteredList: MutableList<word> = emptyList<word>().toMutableList()
        for(item: word in wordList){
            if(item.nombre.lowercase().contains(text.lowercase())){
                filteredList.add(item)
            }
        }

        if(filteredList.isEmpty()){
            Toast.makeText(context, "No se encontraron resultados", Toast.LENGTH_SHORT).show()
        }
        else{
            vocbularyRVAdapter.setFilteredList(filteredList)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val categoria = it.get("categoria") as category
            wordList = categoria.words
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