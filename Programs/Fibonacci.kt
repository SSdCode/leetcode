fun main() {
    printFibonacci(readln());
}

private fun printFibonacci(no: String) {
    var i = no.toInt()
    var a = 0
    var b = 1
    var temp = 0
    print("0, 1")
    while (i >= 0) {
        print(", ${a + b}")
        temp = a
        a = b
        b += temp
        i--
    }
}
