package com.example.practica2_imagenes
import kotlinx.parcelize.Parcelize
import com.squareup.moshi.JsonClass

import android.os.Parcelable
import android.provider.MediaStore

@Parcelize
class imagenes (
    var imagen: Int=0,
    var datos: String = "",
    var estatus:Boolean=false,
    var sonido:Int=0
):Parcelable {
    companion object {
        val imgs = arrayOf(
           imagenes(R.drawable.car,"Carro azul",false, R.raw.viejo),
           imagenes(R.drawable.ic_pickup_car,"Camioneta ",false,R.raw.choque),
           imagenes(R.drawable.ic_caravan,"Combie", false,R.raw.helados),
           imagenes(R.drawable.sportivecar,"Carro deportivo",false,R.raw.derrape),
           imagenes(R.drawable.ic_taxi,"Taxi",false,R.raw.sirena),
           imagenes(R.drawable.stationwagon,"Camping",false,R.raw.reversa),
           imagenes(R.drawable.tow,"Transporte de carros",false,R.raw.bocinacamion)

        )
    }
}

