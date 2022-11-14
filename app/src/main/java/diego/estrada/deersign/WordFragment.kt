package diego.estrada.deersign

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import diego.estrada.deersign.databinding.FragmentWordBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [WordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WordFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentWordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWordBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mediaController = MediaController(context)
        mediaController.setAnchorView(binding.videoView)



        // val packageName = requireContext().packageName



        arguments?.let {
            val palabra = it.get("palabra") as word
            val categoria = it.get("categoria") as category
            val video_id = palabra.source_path

            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)

            if(video_id != null) {

                val offlineUrl =
                    Uri.parse("android.resource://${requireContext().packageName}/${video_id}")
                binding.textView9.text = palabra.nombre
                //binding.videoView.setMediaController(mediaController)
                binding.videoView.setVideoURI(offlineUrl)
                binding.videoView.requestFocus()
                binding.videoView.start()
                binding.videoView.setOnPreparedListener { it.isLooping = true }

            }
            else {
                binding.videoView.isVisible = false

                Toast.makeText(context,"VIDEO NO DISPONIBLE", Toast.LENGTH_SHORT).show()

            }

            val bundle = Bundle()
            bundle.putParcelable("categoria",categoria)
            binding.backBtn.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_wordFragment_to_vocabularyFragment,bundle)
            }
        }
    }
}