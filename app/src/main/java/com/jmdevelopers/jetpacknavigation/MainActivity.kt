package com.jmdevelopers.jetpacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(my_toolbar)
        navController = findNavController(R.id.nav_host)
        // configurando a toolbar para ver o nome e a seta
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {
        // respitar a pilha
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
