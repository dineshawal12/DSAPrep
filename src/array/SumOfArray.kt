package array

fun main(){

    var arr = arrayOf(1,2,3,4,5)

    var sum: Int = 0

    for (i in arr.indices){

        try {

            sum += arr.get(i)
        } catch(e: ArrayIndexOutOfBoundsException) {

            println("ArrayOutOfBound")
        }

    }

//    println(sum)
//    println(arr[0])
    println(arr[0])
    println(arr.size-1)

}