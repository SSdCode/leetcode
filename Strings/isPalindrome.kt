fun main() {
    println("isPalindrome : ${isPalindrome("aabaa")}")
}

fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}