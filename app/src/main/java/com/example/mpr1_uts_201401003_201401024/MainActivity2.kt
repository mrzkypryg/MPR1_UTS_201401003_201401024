package com.example.mpr1_uts_201401003_201401024

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mpr1_uts_201401003_201401024.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main2)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu1-> {
                Toast.makeText(getBaseContext(), "Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu2-> {
                Toast.makeText(this, "Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu3-> {
                Toast.makeText(this, "Not Available yet", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menu4-> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
            else-> {
                return true
            }
        }
        return true
    }
}