fun main() {
    println(interpret("G()(al)"))
}
fun interpret(command: String): String {
    return command.replace("()","o").replace("(","").replace(")","")
}