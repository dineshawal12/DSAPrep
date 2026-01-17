package array


//  Nested arrays
//  -> Arrays can be nested within each other create multidimensional arrays:



fun main(){

//    Create a 2D (two-dimensional) array

    val twoDArray = Array(2) { Array<Int>(2) {0} }
    println(twoDArray.contentDeepToString())

//    Create a 3D (two-dimensional) array

    val threeDArray = Array(3) { Array(3) { Array<Int>(3) {0} } }
    println(threeDArray.contentDeepToString())


    AccessNdModify()

}

fun AccessNdModify(){

    // Arrays are always mutable. To access and modify elements in an array, use the indexed access operator[] :

    val simpleArray = arrayOf(1,2,3,4)
    val twoDArray = Array(2) { Array<Int>(2) {0} }

    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0].toString())
    println(twoDArray[0][0].toString())


}