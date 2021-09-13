package com.example.practica2_imagenes

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Detalle : Fragment(R.layout.fragment_detalle) {

    override fun onResume() {
        super.onResume()

        val imgDetalle: ImageView = requireView().findViewById(R.id.imgDetalle)
        val imgEstrella: ImageView = requireView().findViewById(R.id.imgEstrella)
        val txtDetalle: TextView = requireView().findViewById(R.id.txtDetalle)

        val picture = requireArguments().getParcelable("selectedImg") ?: imagenes()
        imgDetalle.setImageResource(picture.imagen)
        txtDetalle.text=(picture.datos)

        imgDetalle.setOnClickListener {
            (requireActivity() as MainActivity).cambiarFragment(imagen().apply {
                arguments = Bundle().apply {
                    putParcelable("selectedImg",picture)
                }
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