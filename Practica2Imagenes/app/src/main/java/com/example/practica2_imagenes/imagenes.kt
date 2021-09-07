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
           imagenes(R.drawable.car,"a"),
           imagenes(R.drawable.ic_pickup_car,"b"),
           imagenes(R.drawable.ic_caravan,"c"),
           imagenes(R.drawable.sportivecar,"d"),
           imagenes(R.drawable.ic_taxi,"e"),
           imagenes(R.drawable.stationwagon,"f"),
           imagenes(R.drawable.tow,"g")

        )
    }
    /*fun statusChange(status: ImageStatus) {
        images[this.id!!].status = status
    }*/
}

