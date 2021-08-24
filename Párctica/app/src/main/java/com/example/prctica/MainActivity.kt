package com.example.prctica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var list = mutableListOf<animal>()
    var cont = 0
    var max=0

    var anim= listOf(
        gato("Jerry",24),
        perro("Thor",2),
        gato("Felix",12),
        perro("Rony",10),
        gato("Tom",20),
        perro("Mandy",1)
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSound(view: View){
        Toast.makeText(applicationContext,"guaw guaw", Toast.LENGTH_SHORT).show()
    }
    fun play(view: View){
        Toast.makeText(applicationContext,"la musica suena",Toast.LENGTH_SHORT).show()
    }
    fun eat(view: View){
        Toast.makeText(applicationContext,"come, come",Toast.LENGTH_SHORT).show()
    }
    fun createNewPet(view: View){
        var nume = Random.nextInt( 1,   6)
        if (nume == 2 || nume == 4 || nume == 6){
            list.add(anim[nume])
        }else{
            list.add(anim[nume])
        }
        cont++
        txvInfo.text = ("Nombe: ${list[max].nombre}"+" Edad: ${list[max].edad}")
        max++
    }
    fun getPreviousPet(view: View){
        if(cont>=1){
            cont--
            txvInfo.text = ("Nombe: ${list[cont].nombre}"+" Edad: ${list[cont].edad}")
        }else{
            Toast.makeText(applicationContext,"No hay más a la izquierda", Toast.LENGTH_SHORT).show()
        }

    }
    fun getNextPet(view: View){
        if(cont<max - 1) {
            cont++
            txvInfo.text = ("Nombe: ${list[cont].nombre}" + " Edad: ${list[cont].edad}")
        }else{
            Toast.makeText(applicationContext,"No hay más a la derecha", Toast.LENGTH_SHORT).show()
        }
    }
}
