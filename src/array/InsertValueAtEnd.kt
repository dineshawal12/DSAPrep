package array

// Question 1) input arr = [1,2,3], add x = 50 at end

fun main(){

    var arr = arrayOf(1,2,3)

    val x = 50

    arr += x

    println(arr.joinToString())
}

fun main2(){

    val arr = arrayOf(1,2,3,4)

    val key = 2

    for (i in arr){

        if (i == key){
            println(i)
        }
    }
}