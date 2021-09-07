package com.example.practica2_imagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
        private lateinit var imgDetalle: ImageView
        private lateinit var txtDetalle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        imgDetalle= findViewById(R.id.imgDetalle)
        txtDetalle=findViewById(R.id.txtDetalle)

       var picture = intent.getParcelableExtra("selectedImg") ?: imagenes()
        imgDetalle.setImageResource(picture.imagen)
        txtDetalle.text=(picture.datos)


    }
}