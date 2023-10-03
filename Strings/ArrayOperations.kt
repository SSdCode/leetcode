class ArrayOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for (operation in operations) {
            when (operation) {
                "++X" -> ++x
                "X++" -> x++
                "--X" -> --x
                else -> x--
            }
        }
        return x
    }
}

//Solution 2
//class ArrayOperations {
//    fun finalValueAfterOperations(operations: Array<String>): Int =
//        operations.count { it.contains("++") } - operations.count { it.contains("--")}
//}