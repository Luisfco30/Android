package com.example.practica2_imagenes

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.ImageView

class Principal : Fragment(R.layout.fragment_principal) {

    private var cont: Int = 0
    private lateinit var btnInfo: Button
    private lateinit var imgAnterior: ImageView
    private lateinit var imgSiguiente: ImageView
    private lateinit var imgPrincipal: ImageView
    private lateinit var corazon: ImageView
    private lateinit var mp:MediaPlayer;

    override fun onResume() {
        super.onResume()

        imgPrincipal = requireView().findViewById(R.id.imgPrincipal)
        imgAnterior = requireView().findViewById(R.id.btnAnterior)
        imgSiguiente = requireView().findViewById(R.id.btnSiguiente)
        btnInfo = requireView().findViewById(R.id.btnInfo)
        corazon = requireView().findViewById(R.id.imgCorazonP)
        validaciones()
        botones()
    }
    private fun validaciones() {
        when (cont) {
            -1 -> cont = 6
            7 -> cont = 0
        }

        imagenes.imgs[cont].imagen.let { imgPrincipal.setImageResource(it) }
    }
    private fun botones(){
        imgAnterior.setOnClickListener {
            cont--
            validaciones()
        }

        imgSiguiente.setOnClickListener {
            cont++
            validaciones()

        }

        btnInfo.setOnClickListener {
            mp=MediaPlayer.create(context, imagenes.imgs[cont].sonido)
            mp.start()
             (requireActivity() as MainActivity).cambiarFragment(Detalle().apply {
                 arguments = Bundle().apply {
                     putParcelable("selectedImg",imagenes.imgs[cont])
                 }
             })
          }

        corazon.setOnClickListener {
            MediaPlayer.create(context, imagenes.imgs[cont].sonido).start()

          }
    }
}