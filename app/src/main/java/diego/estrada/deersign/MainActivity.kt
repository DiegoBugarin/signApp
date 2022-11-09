package diego.estrada.deersign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import diego.estrada.deersign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.btmNavView)

        val navController = findNavController(R.id.fragmentContainerView)

        /*val bottomNavView = binding.btmNavView
        val navController = findNavController(R.id.fragmentContainerView)*/

        bottomNavView.setupWithNavController(navController)
    }
}