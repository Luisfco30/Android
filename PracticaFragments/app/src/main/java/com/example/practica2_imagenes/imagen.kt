package com.example.practica2_imagenes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class imagen : Fragment(R.layout.fragment_imagen) {
    private lateinit var imgGrande: ImageView

    override fun onResume() {
        super.onResume()

        imgGrande= requireView().findViewById(R.id.imgGrande)

        var picture = requireArguments().getParcelable("selectedImg") ?: imagenes()

        imgGrande.setImageResource(picture.imagen)
    }
}