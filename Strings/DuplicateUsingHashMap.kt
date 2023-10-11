// find duplicate characters in a string using HashMap

fun main(){
    findDuplicateUsingHashMap("geeksforgeeks")
}

fun findDuplicateUsingHashMap(s: String) {
    val hashMap: HashMap<String, Int> = HashMap()

    for (ch in s){
        if (hashMap.containsKey(ch.toString())){
            hashMap[ch.toString()] = hashMap.get(ch.toString())!! + 1
        }else{
            hashMap[ch.toString()] = 1
        }
    }

    for (i in hashMap){
        if (i.value>1)
            println("${i.key} - ${i.value} ")
    }
}
