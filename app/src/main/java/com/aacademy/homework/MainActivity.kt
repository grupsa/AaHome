package com.aacademy.homework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setSupportActionBar(findViewById(R.id.toolbar))

        if (savedInstanceState != null) return

        supportFragmentManager.beginTransaction().apply {
            add(R.id.container, FragmentMoviesList.newInstance())
            commit()
        }
    }

    override fun openScreen() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, FragmentMoviesDetails.newInstance())
            addToBackStack(null)
            commit()
        }
    }
}

interface Navigator {
    fun openScreen()
}