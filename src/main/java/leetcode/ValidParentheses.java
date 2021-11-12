package leetcode;

import java.util.Stack;

// leetcode
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    private static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack();

        for (char ch : arr) {
            if (ch == '(') {
                stack.push(0);
            } else if (ch == ')') {
                if (stack.size() <= 0) return false;
                if (stack.pop() != 0) return false;
            } else if (ch == '{') {
                stack.push(1);
            } else if (ch == '}') {
                if (stack.size() <= 0) return false;
                if (stack.pop() != 1) return false;
            } else if (ch == '[') {
                stack.push(2);
            } else if (ch == ']') {
                if (stack.size() <= 0) return false;
                if (stack.pop() != 2) return false;
            }
        }

        return stack.size() == 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]}")); // true
    }
}
