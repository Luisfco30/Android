package com.example.practica2_imagenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.content.SharedPreferences

class MainActivity2 : AppCompatActivity() {
        private lateinit var imgDetalle: ImageView
        private lateinit var txtDetalle: TextView
        private lateinit var imgEstrella: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        imgDetalle= findViewById(R.id.imgDetalle)
        imgEstrella= findViewById(R.id.imgEstrella)
        txtDetalle=findViewById(R.id.txtDetalle)

       var picture = intent.getParcelableExtra("selectedImg") ?: imagenes()
        imgDetalle.setImageResource(picture.imagen)
        txtDetalle.text=(picture.datos)

        imgDetalle.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java).apply {
                putExtra("selectedImg", picture)
            })
        }

        imgEstrella.setOnClickListener{
            if (!picture.estatus){
                picture.estatus=true
                imgEstrella.setImageResource(R.drawable.ic_estrella)
            }else{
            if (picture.estatus){
                picture.estatus=false
                imgEstrella.setImageResource(R.drawable.ic_estrellanegra)
            }}
        }
    }
}