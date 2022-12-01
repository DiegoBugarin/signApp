package diego.estrada.deersign

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import diego.estrada.deersign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Agregar barra de navegación
        val bottomNavView = findViewById<BottomNavigationView>(R.id.btmNavView)

        //Controlador de navegación para los fragments
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavView.setupWithNavController(navController)

        //Identificar el cambio de destino de fragment
        navController.addOnDestinationChangedListener { _, destination, _ ->

            //Ocultar la barra de navegación en los fragmentos del if
            if((destination.id == R.id.loginFragment) || (destination.id == R.id.vocabularyFragment) || (destination.id == R.id.wordFragment) || (destination.id == R.id.quizFragment) || (destination.id == R.id.editFragment) || (destination.id == R.id.passwordFragment) || (destination.id == R.id.subCategoriesFragment)) {
                bottomNavView.visibility = View.GONE
            }
            //Hacer visible la barra de navegación
            else {

                bottomNavView.visibility = View.VISIBLE
            }
        }
    }
}