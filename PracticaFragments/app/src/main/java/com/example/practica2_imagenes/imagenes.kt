package com.example.practica2_imagenes
import kotlinx.parcelize.Parcelize
import com.squareup.moshi.JsonClass

import android.os.Parcelable

@Parcelize
class imagenes (
    var imagen: Int=0,
    var datos: String = "",
    var estatus:Boolean=false
):Parcelable {
    companion object {
        val imgs = arrayOf(
           imagenes(R.drawable.car,"Carro azul",false),
           imagenes(R.drawable.ic_pickup_car,"Camioneta ",false),
           imagenes(R.drawable.ic_caravan,"Combie"),
           imagenes(R.drawable.sportivecar,"Carro deportivo",false),
           imagenes(R.drawable.ic_taxi,"Taxi",false),
           imagenes(R.drawable.stationwagon,"Camping",false),
           imagenes(R.drawable.tow,"Transporte de carros",false)

        )
    }
}

