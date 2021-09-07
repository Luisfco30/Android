package com.example.practica2_imagenes
import kotlinx.parcelize.Parcelize
import com.squareup.moshi.JsonClass

import android.os.Parcelable

@Parcelize
class imagenes (
    var imagen: Int=0,
    var datos: String = ""
):Parcelable {
    companion object {
        val imgs = arrayOf(
           imagenes(R.drawable.car,"Carro azul"),
           imagenes(R.drawable.ic_pickup_car,"Camioneta "),
           imagenes(R.drawable.ic_caravan,"Combie"),
           imagenes(R.drawable.sportivecar,"Carro deportivo"),
           imagenes(R.drawable.ic_taxi,"Taxi"),
           imagenes(R.drawable.stationwagon,"Camping"),
           imagenes(R.drawable.tow,"Transporte de carros")

        )
    }
}

