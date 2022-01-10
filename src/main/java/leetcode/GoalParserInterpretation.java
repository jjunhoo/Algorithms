package leetcode;

public class GoalParserInterpretation {
    private static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + interpret("G()(al)")); // Goal
        System.out.println("[result] : " + interpret("G()()()()(al)")); // Gooooal
        System.out.println("[result] : " + interpret("(al)G(al)()()G")); // alGalooG
    }
}
