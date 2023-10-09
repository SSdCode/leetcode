import java.util.Scanner

private lateinit var stack: ArrayList<Int>
private val reader = Scanner(System.`in`)
fun main() {

    stack = ArrayList()
    var i = 1
    do {
        print(
            """
                Enter your choice
                1) Push
                2) Pop
                3) Top
                4) Display
                5) Size
                6) Exit
                :"""
        )
        val choice = reader.nextInt()

        when (choice) {
            1 -> push()
            2 -> pop()
            3 -> top()
            4 -> display()
            5 -> printSize()
            6 -> i = 2
            else -> print("Please enter right choice.")
        }

    } while (i == 1)
}

private fun printSize() {
    print(stack.size)
}

private fun display() {
    if (stack.isEmpty()) {
        print("Stack in Empty!")
    } else{
        for (i in stack.reversed()) {
            print("$i, ")
        }
    }
}

private fun top() {
    if (stack.isEmpty()) {
        print("Stack is Empty!")
    } else {
        print(stack[stack.size - 1])
    }
}

private fun pop() {
    stack.removeLastOrNull()
}

private fun push() {
    print("Enter number into the stack : ")
    stack.add(reader.nextInt())
}
