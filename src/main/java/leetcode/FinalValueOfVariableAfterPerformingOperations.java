package leetcode;

// Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ++result;
            } else {
                --result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + finalValueAfterOperations(new String[]{ "--X", "X++", "X++" }));
        System.out.println("[result] : " + finalValueAfterOperations(new String[]{ "++X","++X","X++" }));
        System.out.println("[result] : " + finalValueAfterOperations(new String[]{ "X++","++X","--X","X--" }));
    }
}
