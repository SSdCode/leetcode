// find duplicate characters in a string

fun main(){
    findDuplicate("geeksforgeeks")
}

fun findDuplicate(s: String) {
    val mStr = ArrayList<Char>()
    val mInt = ArrayList<Int>()

    for (ch in s){
        if (!mStr.contains(ch)){
            mStr.add(ch)
            var count = 0
            for (chh in s){
                if (chh == ch){
                    count++
                }
            }
            mInt.add(count)
        }
    }
    for (i in 1..mStr.size){
        if (mInt[i-1] > 1){
            print("${mStr[i-1]} -> ${mInt[i-1]} \n")
        }
    }
}
