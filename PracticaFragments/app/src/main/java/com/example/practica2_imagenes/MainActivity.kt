package com.example.practica2_imagenes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragment, Principal()).commit()

    }

    fun cambiarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            setCustomAnimations(
                R.anim.slide_in_rigth,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_rigth
            )
            replace(R.id.fragment, fragment)
            addToBackStack(fragment.tag)
            commit()
        }
    }
    }




