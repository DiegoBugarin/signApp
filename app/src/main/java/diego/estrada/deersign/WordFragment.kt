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

//Fragmento de palabra
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

        //mediaController para le video
        val mediaController = MediaController(context)
        mediaController.setAnchorView(binding.videoView)

        arguments?.let {
            val palabra = it.get("palabra") as word //Extraer la palabra del bundle
            val categoria = it.get("categoria") as category //Extraer la categoría del bundle
            val video_id = palabra.source_path //Obtener el origen del video de la palabra

            //Asignar el color y texto del toolbar al de la categoría
            binding.toolbar.setBackgroundColor(Color.parseColor(categoria.color))
            binding.toolbarTextView.setText(categoria.nombre)

            //Si el origen del video no es vacío
            if(video_id != null) {

                //Reproducir el video en loop
                val offlineUrl =
                    Uri.parse("android.resource://${requireContext().packageName}/${video_id}")
                binding.textView9.text = palabra.nombre
                //binding.videoView.setMediaController(mediaController)
                binding.videoView.setVideoURI(offlineUrl)
                binding.videoView.requestFocus()
                binding.videoView.start()
                binding.videoView.setOnPreparedListener { it.isLooping = true }

            }

            //En caso de que el enlace esté vacío
            else {
                //Desplegar que el video no está disponible
                binding.videoView.isVisible = false

                Toast.makeText(context,"VIDEO NO DISPONIBLE", Toast.LENGTH_SHORT).show()

            }

            val bundle = Bundle()
            //Poner en bundle la categoría
            bundle.putParcelable("categoria",categoria)
            //Botón para regresar al fragmento de vocabulario
            binding.backBtn.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_wordFragment_to_vocabularyFragment,bundle)
            }
        }
    }
}