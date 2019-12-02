package com.jmdevelopers.jetpacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jmdevelopers.jetpacknavigation.ui.StartFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // aqui ele adiciona o o fragment no main activity
        supportFragmentManager.beginTransaction().add(R.id.container, StartFragment.newinstance())
            .commit()

    }
}
