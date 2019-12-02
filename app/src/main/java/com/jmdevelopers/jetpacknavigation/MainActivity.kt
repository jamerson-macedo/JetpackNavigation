package com.jmdevelopers.jetpacknavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jmdevelopers.jetpacknavigation.ui.ProfileFragment
import com.jmdevelopers.jetpacknavigation.ui.StartFragment

class MainActivity : AppCompatActivity(), StartFragment.OnbuttonCliked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // aqui ele adiciona o o fragment no main activity
        supportFragmentManager.beginTransaction().add(R.id.container, StartFragment.newinstance())
            .commit()

    }

    override fun buttoncliked() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ProfileFragment.newinstance()).commit()
    }
}
