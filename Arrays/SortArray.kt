// sort the array
fun main(){
    var array = arrayOf(1, -1, 3, 2, -7, -5, 11, 6)

    val newArray = formatArray(array)

    for(i in newArray){
        print("$i, ")
    }
}

fun formatArray(array: Array<Int>): Array<Int> {
    var temp: Int
    for (i in array.indices){
        for (j in i+1..<array.size) {
            if (i != array.size - 1) {
                if (array[i] > array[j]) {
                    temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
        }
    }
    return array
}
