package com.example.practica2_imagenes

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var cont: Int = 0
    private lateinit var btnInfo: Button
    private lateinit var imgAnterior: ImageView
    private lateinit var imgSiguiente: ImageView
    private lateinit var imgPrincipal: ImageView
    private lateinit var im: imagenes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgPrincipal = findViewById(R.id.imgPrincipal)
        imgAnterior = findViewById(R.id.btnAnterior)
        imgSiguiente = findViewById(R.id.btnSiguiente)
        btnInfo = findViewById(R.id.btnInfo)
        validaciones()
        botones()
    }

     fun validaciones() {
         when (cont) {
             -1 -> cont = 6
             7 -> cont = 0
         }

         imagenes.imgs[cont].imagen?.let { imgPrincipal.setImageResource(it) }
     }
     fun botones(){
        imgAnterior.setOnClickListener {
            cont--
            validaciones()
        }

        imgSiguiente.setOnClickListener {
            cont++
            validaciones()

        }

        btnInfo.setOnClickListener {
                startActivity(Intent(this, MainActivity2::class.java).apply {
                    putExtra("selectedImg",imagenes.imgs[cont])
                })
            }
        }
    }




