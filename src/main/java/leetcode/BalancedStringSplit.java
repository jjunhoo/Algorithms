package leetcode;

public class BalancedStringSplit {

    public static int balancedStringSplit(String s) {

        char[] arr = s.toCharArray();

        int lstack = 0;
        int rstack = 0;
        int result = 0;

        for (char c : arr) {
            if (c == 'L') {
                lstack++;
            } else {
                rstack++;
            }
            // 'L' 과 'R' 문자의 개수가 같아진 경우 + 1
            if (lstack == rstack) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
}
