package programmers;

import java.util.Stack;

// 올바른 괄호
// https://programmers.co.kr/learn/courses/30/lessons/12909
public class CorrectParenthesis {
    private static boolean solution(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : arr) {
            if (ch == '(') {
                stack.push(ch);
                result++;
            } else if (ch == ')') {
                // 스택에 '(' 가 없는데, pop 하는 경우, 올바른 괄호가 아니기 때문에 false 리턴
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
                result--;
            }
        }
        return result == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution("()()")); // true
        System.out.println("[result] : " + solution("(())()")); // true
        System.out.println("[result] : " + solution(")()(")); // false
        System.out.println("[result] : " + solution("(()(")); // false
    }
}
