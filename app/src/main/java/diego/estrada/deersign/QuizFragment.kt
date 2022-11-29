package diego.estrada.deersign

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ServerValue
import diego.estrada.deersign.databinding.FragmentProfileBinding
import diego.estrada.deersign.databinding.FragmentQuizBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [QuizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    lateinit var subCat: subCategorias
    lateinit var cat: category
    lateinit var preguntas: MutableList<word>
    lateinit var palabras: MutableList<word>
    lateinit var palabrasHelper: MutableList<word>
    lateinit var opciones: MutableList<word>
    lateinit var answer: word
    lateinit var selectedAnswer: String
    var answerIndex: Int = 0
    lateinit var answerBtn: Button
    var score: Int = 0

    val dataBase = FirebaseDatabase.getInstance().getReference()
    val mAuth = FirebaseAuth.getInstance()
    var user = mAuth.currentUser;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            subCat = it.get("subCat") as subCategorias
            cat = it.get("categoria") as category
            preguntas = cat.words
            preguntas = preguntas.shuffled() as MutableList<word>
            palabras = preguntas
        }

    }

    private fun setUi(){
        val video_id = answer.source_path
        if(video_id != null) {

            val offlineUrl =
                Uri.parse("android.resource://${requireContext().packageName}/${video_id}")
            //binding.videoView.setMediaController(mediaController)
            binding.videoView2.setVideoURI(offlineUrl)
            binding.videoView2.requestFocus()
            binding.videoView2.start()
            binding.videoView2.setOnPreparedListener { it.isLooping = true }

        }
        else {
            binding.videoView2.isVisible = false

            Toast.makeText(context,"VIDEO NO DISPONIBLE", Toast.LENGTH_SHORT).show()

        }
        binding.ansA.setText(opciones[0].nombre)
        binding.ansB.setText(opciones[1].nombre)
        binding.ansC.setText(opciones[2].nombre)
        binding.ansD.setText(opciones[3].nombre)

        binding.ansA.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansB.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansC.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansD.setBackgroundColor(Color.parseColor("#CDCDCD"))

    }

    private fun getQuestion(){
        opciones = preguntas.asSequence().shuffled().take(4).toMutableList()
        answer = opciones.random()
        answerIndex = opciones.indexOf(answer)

    }

    private fun wrongAnswer(button: Button){
        when(answerIndex){
            0 -> {
                answerBtn = binding.ansA
            }
            1 -> {
                answerBtn = binding.ansB
            }
            2 -> {
                answerBtn = binding.ansC
            }
            3 -> {
                answerBtn = binding.ansD
            }
        }

        button.setBackgroundColor(Color.parseColor("#ff5d55"))
        answerBtn.setBackgroundColor(Color.parseColor("#629c44"))
    }

    private fun checkAswer(button: Button){
        val bundle = Bundle()
        if(answer.nombre == selectedAnswer){
            score+= 1
            binding.progressBar4.progress = score
            button.setBackgroundColor(Color.parseColor("#629c44"))
        }

        else{
            wrongAnswer(button)
        }

        if(score < 5){
            getQuestion()
            Handler(Looper.getMainLooper()).postDelayed(
                {
                    button.setBackgroundColor(Color.parseColor("#CDCDCD"))
                    setUi()
                    // This method will be executed once the timer is over
                },
                1100 // value in milliseconds
            )
        }
        else{

            if(user?.isAnonymous == true){
                user?.let {
                    dataBase.child("Guests").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                        it.uid).get().addOnSuccessListener {
                        val complete = it.value as Boolean
                        if(!complete){
                            addGuestValues()
                        }
                    }
                }

                user?.let { dataBase.child("Guests").child("Users").child(it.uid).child("Progreso").setValue(ServerValue.increment(1)) }
            }

            else if(user != null){
                user?.let {
                    dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                        it.uid).get().addOnSuccessListener {
                        val complete = it.value as Boolean
                        if(!complete){
                            addValues()
                        }
                    }
                }

                user?.let { dataBase.child("John Deere").child("Empleados").child(it.uid).child("avance").setValue(ServerValue.increment(1)) }
            }

            view?.let { Navigation.findNavController(it).navigate(R.id.action_quizFragment_to_completeFragment, bundle) }
            //Toast.makeText(activity, score.toString(), Toast.LENGTH_SHORT).show()
        }
        //button.setBackgroundColor(Color.parseColor("#FFFFFF"))
    }

    private fun addValues() {
        user?.let {
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                it.uid).setValue(true)
        }


        user?.let {
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child("progress").child(
                it.uid).setValue(
                ServerValue.increment(1))
        }

    }

    private fun addGuestValues() {
        user?.let {
            dataBase.child("Guests").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                it.uid).setValue(true)
        }


        user?.let {
            dataBase.child("Guests").child("Categorias").child(cat.nombre).child("progress").child(
                it.uid).setValue(
                ServerValue.increment(1))
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        binding.progressBar4.max = 5
        binding.toolbar.setBackgroundColor(Color.parseColor(cat.color))
        getQuestion()
        setUi()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.ansA.setOnClickListener {
            selectedAnswer = binding.ansA.text.toString()
            checkAswer(binding.ansA)
        }

        binding.ansB.setOnClickListener {
            selectedAnswer = binding.ansB.text.toString()
            checkAswer(binding.ansB)
        }

        binding.ansC.setOnClickListener {
            selectedAnswer = binding.ansC.text.toString()
            checkAswer(binding.ansC)
        }

        binding.ansD.setOnClickListener {
            selectedAnswer = binding.ansD.text.toString()
            checkAswer(binding.ansD)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.pista.setOnClickListener {
                val toast = Toast.makeText(context, answer.nombre, Toast.LENGTH_LONG)
                toast.show()
            }

    }

}