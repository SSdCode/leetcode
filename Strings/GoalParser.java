// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".

class GoalParser{
    public static void main(String args[]){
        System.out.println(interpret("G()(al)"));
    }

    private static String interpret(String string) {
        return string.replace("()", "o").replace("(", "").replace(")", "");
    }

}