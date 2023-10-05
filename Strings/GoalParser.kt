// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".

fun main() {
    println(interpret("G()(al)"))
}
fun interpret(command: String): String {
    return command.replace("()","o").replace("(","").replace(")","")
}