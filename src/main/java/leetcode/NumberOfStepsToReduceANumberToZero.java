package leetcode;

// Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToReduceANumberToZero {
    private static int numberOfSteps(int num) {
        int result = 0;

        while (num > 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + numberOfSteps(14)); // 6
        System.out.println("[result] : " + numberOfSteps(8)); // 4
        System.out.println("[result] : " + numberOfSteps(123)); // 12
    }
}
