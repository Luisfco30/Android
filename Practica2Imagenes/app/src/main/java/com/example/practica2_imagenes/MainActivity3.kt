package com.example.practica2_imagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    private lateinit var imgGrande:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        imgGrande= findViewById(R.id.imgGrande)

        var picture = intent.getParcelableExtra("selectedImg") ?: imagenes()
        imgGrande.setImageResource(picture.imagen)

    }

}