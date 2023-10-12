//Program to print Max and Min from an array

fun main() {
    val myArray = arrayOf(1,5,2,4,6,3,2)
    println("Minimum from array is ${minOfArray(myArray)}")
    println("Maximum from array is ${maxOfArray(myArray)}")
}

fun minOfArray(myArray: Array<Int>): Int {
    val sortedArray = myArray.sortedArray()
    return sortedArray[0]
}

fun maxOfArray(myArray: Array<Int>): Int {
    val sortedArray = myArray.sortedArray()
    return sortedArray[myArray.size-1]
}
