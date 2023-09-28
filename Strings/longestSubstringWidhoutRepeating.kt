import kotlin.math.max

fun main() {
    //Given a string s, find the length of the longest substring without repeating characters.
    println("Longest substring is : ${lengthOfLongestSubstring("aab")}")
    println("Longest substring is : ${lengthOfLongestSubstring("dvdf")}")
    println("Longest substring is : ${lengthOfLongestSubstring("jbpnbwwd")}")
    println("Longest substring is : ${lengthOfLongestSubstring("hkcpmprxxxqw")}")
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s == "") {
        return 0
    }
    var start = 0
    var end = 0
    var maxLength = 0
    val uniqueCharacters: MutableSet<Char> = HashSet()
    while (end < s.length) {
        if (uniqueCharacters.add(s[end])) {
            end++
            maxLength = max(maxLength.toDouble(), uniqueCharacters.size.toDouble()).toInt()
        } else {
            uniqueCharacters.remove(s[start])
            start++
        }
    }
    return maxLength
}