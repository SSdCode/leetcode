//Program to reverse an array

fun main() {
    val myArray = arrayOf(1,5,2,4,6,3,2)
//    val reversedArray = reverseArrayMethod1(myArray)
    val reversedArray = reverseArrayMethod2(myArray)
    for (i in reversedArray)
        print("$i, ")
}

fun reverseArrayMethod2(myArray: Array<Int>): Array<Int> {
    var left = 0
    var right = myArray.size-1
    while (left<right){
        val temp = myArray[left]
        myArray[left] = myArray[right]
        myArray[right] = temp
        left++
        right--
    }
    return myArray
}

fun reverseArrayMethod1(myArray: Array<Int>): Array<Int> {
    return myArray.reversedArray()
}
