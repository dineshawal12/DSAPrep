package array

fun main(){

    var arr = arrayOf(10,20,30,40)

    val key = 2

    // Solution 1

    for (i in arr.withIndex()){

        if (i.index == key){
            println(i.value)
        }
    }

    println("Element at Index $key: ${findIndex(arr, key)}")

}

// Solution 2

fun findIndex(array: Array<Int>, key: Int):Int{

    if (key < 0 || key >= array.size){

        throw IndexOutOfBoundsException("Out of bound")
    }
    return array[key]
}