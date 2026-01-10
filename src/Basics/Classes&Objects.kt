package Basics

class Cars(val name:String, val type: String) {

    fun driveCar(){
        println("${name} Car is driving. ")
    }

    fun applyBreak(){
        println("${name} Break is applying. ")
    }

}

fun main(){

    val tata = Cars("Tata","Petrol")
    val kia = Cars("Kia","Petrol")

    println(tata.name)
    println(kia.name)


    tata.driveCar()
    tata.applyBreak()
    kia.applyBreak()
}