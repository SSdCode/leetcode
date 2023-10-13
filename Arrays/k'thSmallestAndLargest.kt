//Kth Minimum/Maximum element

fun main() {
    val myArray = arrayOf(1,5,2,4,6,3,2)
    println("3rd Minimum in  array is - ${minOfArray(myArray, 3)}")
    println("3rd Maximum in  array is - ${maxOfArray(myArray, 3)}")
}

fun minOfArray(myArray: Array<Int>, k: Int): Int {
    val sortedArray = myArray.sortedArray()
    return sortedArray[0+k-1]
}

fun maxOfArray(myArray: Array<Int>, k: Int): Int {
    val sortedArray = myArray.sortedArray()
    return sortedArray[myArray.size -k]
}

