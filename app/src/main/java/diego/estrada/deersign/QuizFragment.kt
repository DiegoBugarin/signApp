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

//Fragmento de quiz
class QuizFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    lateinit var subCat: subCategorias //Subcategoria
    lateinit var cat: category //Categoria
    lateinit var preguntas: MutableList<word> //Lista de preguntas a desplegar
    lateinit var palabras: MutableList<word>  //Palabras de la categoría
    lateinit var palabrasHelper: MutableList<word>
    lateinit var opciones: MutableList<word> //Lista de opciones a desplegar por pregunta
    lateinit var answer: word //Respuesta a la pregunta
    lateinit var selectedAnswer: String //Respuesta seleccionada (string)
    var answerIndex: Int = 0 //Índice de la pregunta MAX 5
    lateinit var answerBtn: Button //Botón de la respuesta
    var score: Int = 0 //Puntuación

    val dataBase = FirebaseDatabase.getInstance().getReference() //Referencia a base de datos
    val mAuth = FirebaseAuth.getInstance() //Instancia de autentificación
    var user = mAuth.currentUser; //Usuario logeado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            subCat = it.get("subCat") as subCategorias //Asignar la Subcategoría del Bundle
            cat = it.get("categoria") as category //Asignar la categoría del Bundle
            preguntas = cat.words //Asignar las palabras de la categoría a preguntas
            preguntas = preguntas.shuffled() as MutableList<word> //Mezclar el orden de las palabras como lista
            palabras = preguntas //Asignar las palabras igual a la lista de las preguntas
        }

    }

    //Poner el UI inicial de la pantalla de preguntas
    private fun setUi(){
        val video_id = answer.source_path //Asignar el origen del video de la pregunta

        //Si el id tiene valor
        if(video_id != null) {

            //Reproducir el video en loop
            val offlineUrl =
                Uri.parse("android.resource://${requireContext().packageName}/${video_id}")
            //binding.videoView.setMediaController(mediaController)
            binding.videoView2.setVideoURI(offlineUrl)
            binding.videoView2.requestFocus()
            binding.videoView2.start()
            binding.videoView2.setOnPreparedListener { it.isLooping = true }

        }

        //El video no está disponible
        else {
            binding.videoView2.isVisible = false

            Toast.makeText(context,"VIDEO NO DISPONIBLE", Toast.LENGTH_SHORT).show()

        }

        //Asignar el texto a los botones de acuerdo a las opciones
        binding.ansA.setText(opciones[0].nombre)
        binding.ansB.setText(opciones[1].nombre)
        binding.ansC.setText(opciones[2].nombre)
        binding.ansD.setText(opciones[3].nombre)

        //Asignar el color de fondo del botón
        binding.ansA.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansB.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansC.setBackgroundColor(Color.parseColor("#CDCDCD"))
        binding.ansD.setBackgroundColor(Color.parseColor("#CDCDCD"))

    }

    //Función para generar la pregunta
    private fun getQuestion(){
        //Mezclar las preguntas y tomar 4 opciones
        opciones = preguntas.asSequence().shuffled().take(4).toMutableList()
        //Seleccionar una palabra random de las opciones como respuesta
        answer = opciones.random()
        //Asignar el índice de la respuesta seleccionada
        answerIndex = opciones.indexOf(answer)

    }

    //Función para cambiar de color a rojo el botón de la respuesta equvocada
    private fun wrongAnswer(button: Button){

        //Asignar el botón seleccionado dependiendo del valor del índice
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

        //Cambiar el botón equivocado a rojo
        button.setBackgroundColor(Color.parseColor("#ff5d55"))
        //Poner la respuesta correcta como verde
        answerBtn.setBackgroundColor(Color.parseColor("#629c44"))
    }

    //Revisar si la respuesta fue correcta
    private fun checkAswer(button: Button){
        val bundle = Bundle()

        //La respuesta es correcta
        if(answer.nombre == selectedAnswer){
            score+= 1 //Sumar puntos a la barra de progreso
            binding.progressBar4.progress = score //Actualizar la barra de progreso
            button.setBackgroundColor(Color.parseColor("#629c44")) //Cambiar el botón a verde
        }

        //La respuesta es equivocada
        else{
            wrongAnswer(button) //Ejecutar la función de wrongAnswer con el botón seleccionado
        }

        //Todavía no se completan las 5 preguntas correctas
        if(score < 5){
            getQuestion() //Generar pregunta

            //Dar tiempo entre preguntas y actualizar el UI
            Handler(Looper.getMainLooper()).postDelayed(
                {
                    button.setBackgroundColor(Color.parseColor("#CDCDCD"))
                    setUi()
                    // This method will be executed once the timer is over
                },
                1100 // value in milliseconds
            )
        }

        //Se completaron las 5 preguntas
        else{

            //El usuario es invitado
            if(user?.isAnonymous == true){
                user?.let {
                    //Saber si la categoría ya se había completado para actualizar o no el valor
                    dataBase.child("Guests").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                        it.uid).get().addOnSuccessListener {
                        val complete = it.value as Boolean
                        //Si no se ha completado, actualizar el progreso
                        if(!complete){
                            addGuestValues()
                        }
                    }
                }

                user?.let { dataBase.child("Guests").child("Users").child(it.uid).child("progreso").setValue(ServerValue.increment(1)) }
            }

            //El usuario es de la institución
            else if(user != null){
                user?.let {
                    //Saber si la categoría ya se había completado para actualizar o no el valor
                    dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                        it.uid).get().addOnSuccessListener {
                        val complete = it.value as Boolean
                        //Si no se ha completado, actualizar el progreso
                        if(!complete){
                            addValues()
                        }
                    }
                }

                user?.let { dataBase.child("John Deere").child("Empleados").child(it.uid).child("avance").setValue(ServerValue.increment(1)) }
            }

            //Ir a la pantalla de completado
            view?.let { Navigation.findNavController(it).navigate(R.id.action_quizFragment_to_completeFragment, bundle) }
        }
    }

    //Función para actualizar valores del usuario de la institución
    private fun addValues() {
        user?.let {
            //Actualizar el valor de la subcategoría como completada
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                it.uid).setValue(true)
        }

        //Aumentar el valor del progreso del usuario en la categoría
        user?.let {
            dataBase.child("John Deere").child("Categorias").child(cat.nombre).child("progress").child(
                it.uid).setValue(
                ServerValue.increment(1))
        }

        //Actualizar el valor del progreso total del usuario
        user?.let {
            //Incrementar el valor del progreso total del empleado
            dataBase.child("John Deere").child("Empleados").child(user!!.uid).child("progreso").setValue(
                ServerValue.increment(1))
        }

    }

    //Función para agregar los valores de los invitados
    private fun addGuestValues() {
        user?.let {
            //Actualizar la subcategoría como completada
            dataBase.child("Guests").child("Categorias").child(cat.nombre).child(subCat.nombre).child(
                it.uid).setValue(true)
        }


        //Incrementar el valor del progreso de la categoría
        user?.let {
            dataBase.child("Guests").child("Categorias").child(cat.nombre).child("progreso").child(
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
        binding.progressBar4.max = 5  //El progreso máximo de la barra es de 5
        binding.toolbar.setBackgroundColor(Color.parseColor(cat.color)) //Asignar el color del fondo del toolbar
        getQuestion() //Generar pregunta
        setUi() //Actualizar el UI
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Selección de preguna A y checar si es correcta
        binding.ansA.setOnClickListener {
            selectedAnswer = binding.ansA.text.toString()
            checkAswer(binding.ansA)
        }

        //Selección de preguna B y checar si es correcta
        binding.ansB.setOnClickListener {
            selectedAnswer = binding.ansB.text.toString()
            checkAswer(binding.ansB)
        }

        //Selección de preguna C y checar si es correcta
        binding.ansC.setOnClickListener {
            selectedAnswer = binding.ansC.text.toString()
            checkAswer(binding.ansC)
        }

        //Selección de preguna D y checar si es correcta
        binding.ansD.setOnClickListener {
            selectedAnswer = binding.ansD.text.toString()
            checkAswer(binding.ansD)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Botón de pista en pregunta para desplegar la respuesta
            binding.pista.setOnClickListener {
                val toast = Toast.makeText(context, answer.nombre, Toast.LENGTH_LONG)
                toast.show()
            }

    }

}
