package diego.estrada.deersign

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import diego.estrada.deersign.databinding.FragmentQuizBinding
import kotlin.random.Random


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [QuizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
 class QuizFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    private lateinit var ansA: Button
    private lateinit var ansB: Button
    private lateinit var ansC: Button
    private lateinit var ansD: Button

    // TODO: Rename and change types of parameters
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var ivImage: VideoView? = null

    private var score: Int = 0
    private var totalQuestions: Int = 0
    lateinit var answers: MutableList<word>
    lateinit var palabras: MutableList<word>
    private var options: MutableList<word> = mutableListOf()
    lateinit var question: word
    private var currentQuestionIndex: Int = 0
    private var selectedAnswer: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
        var categories = it.get("subCategoria") as subCategorias
        answers = categories.grupoVideos
        answers.shuffle()
        palabras = categories.grupoVideos
        totalQuestions = palabras.size}

        ansA = binding.ansA
        ansB = binding.ansB
        ansC = binding.ansC
        ansD = binding.ansD

        getQuestion()

        ansA.setOnClickListener(this)
        ansB.setOnClickListener(this)
        ansC.setOnClickListener(this)
        ansD.setOnClickListener(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            // Inflate the layout for this fragment
            _binding = FragmentQuizBinding.inflate(inflater, container, false)
            return binding.root
    }

    private fun getQuestion() {
        var index: Int = Random.nextInt(0, answers.size - 1)
        question = answers[index]
        answers.removeAt(index)
        var optionHelper: MutableList<word> = palabras
        optionHelper.remove(question)
        options = optionHelper.shuffled().take(3).toMutableList()
        options.add(question)
        options.shuffle()

        binding.progressBar4.progress = score

        binding.videoView2.setVideoPath(question.source_path)
        binding.ansA.text = options[0].nombre
        binding.ansB.text = options[1].nombre
        binding.ansC.text = options[2].nombre
        binding.ansD.text = options[3].nombre

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            progressBar?.max = totalQuestions
            progressBar?.progress = score
            ansA.setText(options[0].nombre)
            ansB.setText(options[1].nombre)
            ansC.setText(options[2].nombre)
            ansD.setText(options[3].nombre)

        //binding.videoView2.setVideoPath(question.source_path)

            }

    override fun onClick(view: View?) {
        TODO("Not yet implemented")

    }
}