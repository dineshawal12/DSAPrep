package array

fun removeDuplicates(nums: IntArray): Int {

    var index = 1

    for (i in 1 until nums.size) {

        if (nums[i] != nums[i - 1]) {

            nums[index] = nums[i]
            index++
        }
    }

    return index
}


fun main(){

    var array = intArrayOf(1,1,2,2,3,4,4)

    var result = removeDuplicates(array)

    print("Unique values: ")

    for (i in 0 until result) {
        print("${array[i]} ")
    }

}