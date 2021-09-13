package com.example.practica2_imagenes

import android.graphics.Picture
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class Principal : Fragment(R.layout.fragment_principal) {

    private var cont: Int = 0
    private lateinit var btnInfo: Button
    private lateinit var imgAnterior: ImageView
    private lateinit var imgSiguiente: ImageView
    private lateinit var imgPrincipal: ImageView
    private lateinit var im: imagenes

    override fun onResume() {
        super.onResume()

        imgPrincipal = requireView().findViewById(R.id.imgPrincipal)
        imgAnterior = requireView().findViewById(R.id.btnAnterior)
        imgSiguiente = requireView().findViewById(R.id.btnSiguiente)
        btnInfo = requireView().findViewById(R.id.btnInfo)
        validaciones()
        botones()
    }
    fun validaciones() {
        when (cont) {
            -1 -> cont = 6
            7 -> cont = 0
        }

        imagenes.imgs[cont].imagen.let { imgPrincipal.setImageResource(it) }
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
             (requireActivity() as MainActivity).cambiarFragment(Detalle().apply {
                 arguments = Bundle().apply {
                     putParcelable("selectedImg",imagenes.imgs[cont])
                 }
             })
          }
    }
}