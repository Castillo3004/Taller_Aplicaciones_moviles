package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MayoroMenor()
        TablaMultiplicar()
        listadoParalelo()
        Vehiculo()
        ValidaCedula ()
        IVA()
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

    // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.

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

    // Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listadoParalelo() {
        println("Estudiantes")
        val estudiantes = listOf<String>(
            "Carlos Castillo",
            "Joselo Ordoñez",
            "Isaias Silva",
            "Anthonny Espinosa"
        )

        var lista = estudiantes.sorted()
        println(lista)

        println("\nGRUPOS")
        val grupos = mutableMapOf(
            "Carlos Castillo" to "G1",
            "Joselo Ordoñez" to "G1",
            "Isaias Sila" to "G2",
            "Anthonny Espinosa" to "G2"
        )
        var listaGrupos = grupos.toList().sortedBy { (_, value) -> value}.toMap()
        for(aux in listaGrupos){
            println(aux.key + " - "+ aux.value)
        }

    }


    // Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
    fun Vehiculo (){
        val primero = CaracteristicasVehiculo(traccion = "Automatico", motor = 4000, tipo = "SEDAN" , capacidad = 4)
        println("\nTraccion: "+primero.traccion +"\nMotor: "+ primero.motor)
    }

    class CaracteristicasVehiculo( val traccion:String, val motor:Int, val tipo:String, val capacidad:Int){

    }

    // Cedula con algoritmo

    fun ValidaCedula (){
        val lis1 = mutableListOf(2,1,2,1,2,1,2,1,2)
        var lis2 = mutableListOf(2,1,2,1,2,1,2,1,2)
        var cedula = "1105140881"
        var cont = 0
        val aux = cedula.map(Character::getNumericValue).toIntArray()
        for(i in aux){
            if(cont < aux.size - 1 ){
                var mul = i * lis1[cont]
                if(mul.toString().length > 1){
                    val aux2 = mul.toString().map(Character::getNumericValue).toIntArray()
                    mul = 0
                    for ( i in aux2){
                        mul += i
                    }
                }
                lis2[cont] = mul
                cont += 1
            }
        }
        var comprobacion = aux.sum() - lis2.sum()
        if(comprobacion == 0){
            println("La Cedula es valida")
        }else{
            println("La Cedula es invalida")
        }


    }

    // IVA
    fun IVA(){
        val numero = 25
        val iva = (numero*0.12)
        val res = (numero + iva)
        println("Total sin IVA =  "+ numero)
        println("IVA = " +  iva)
        println("Total + IVA = "+ res)
    }





}





