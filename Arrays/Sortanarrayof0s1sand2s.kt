import java.util.Scanner

//Sort an array of 0s, 1s and 2s

fun main() {
    val n: Int
    val sc = Scanner(System.`in`)
    println("Enter the value of n: ")
    n=sc.nextInt()
    var myArray = IntArray(n)
    for (i in 0..<n){
        println("Enter element $i :")
        myArray[i] = sc.nextInt()
    }
    myArray = sortArray(myArray)
    println("Sorted Array - ")
    for (i in 0..<n){
        if (i != n-1)
            print("${myArray[i]}, ")
        else
            print("${myArray[i]}")
    }
}

fun sortArray(myArray: IntArray): IntArray {
    val returnArray = IntArray(myArray.size)
    var count0 = 0
    var count1 = 0
    var count2 = 0
    for (i in myArray){
        if (i ==0) count0++
        if (i ==1) count1++
        if (i ==2) count2++
    }

    for (i in 0..<count0){
        returnArray[i] = 0
    }
    for (i in count0..<count1+count0){
        returnArray[i] = 1
    }
    for (i in count1+count0..<myArray.size){
        returnArray[i] = 2
    }
    return returnArray
}


