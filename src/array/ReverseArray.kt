package array

fun reverseArray(arr: Array<Int>, size: Int) : Array<Int> {

    var start = 0
    var end = size - 1
    while (start < end) {
        var temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
    return arr

}

fun main() {

    var a = arrayOf(1, 4, 6, 7, 8, 2)
    val size = 6

    reverseArray(a, size)

    for(i in 0..<size) {

        print("${a[i]}")

    }
}