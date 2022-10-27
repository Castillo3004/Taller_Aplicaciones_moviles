package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MayoroMenor()
        TablaMultiplicar()
    }

    // Validar si una persona es mayor o menor de edad
    fun MayoroMenor(){
        val edad = 19
        if (edad >= 18 ){
            println("Es mayor de edad")
        }else{
            println("Es menor de edad")
        }
    }

    fun TablaMultiplicar(){

        val numero = 3
        var aux = 0

        println("Tabla de multiplicar del " + numero)
        println("\nForma Ascendente ")
        for (i in 1 .. 12) {
            aux = numero * i
            println("$numero * $i = $aux" )
        }
        println("\n")
        println("Forma Descendente ")
        for (i in 12 downTo 1){
            aux = numero * i
            println("$numero * $i = $aux" )
        }
    }

    fun listadoParalelo(){

        val myArray = arrayListOf<String>()

    }

}





