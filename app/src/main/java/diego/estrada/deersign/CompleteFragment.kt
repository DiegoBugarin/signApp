package diego.estrada.deersign

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import diego.estrada.deersign.databinding.FragmentCompleteBinding
import diego.estrada.deersign.databinding.FragmentDictionaryBinding

//Fragmento de QUIZ completado
class CompleteFragment : Fragment() {
    private var _binding: FragmentCompleteBinding?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCompleteBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()

        //Cambiar a HomeFragment después de 5 segundos
        Handler(Looper.getMainLooper()).postDelayed(
            {
                Navigation.findNavController(view).navigate(R.id.action_completeFragment_to_homeFragment,bundle)
            },
            5000 // value in milliseconds
        )
    }

}