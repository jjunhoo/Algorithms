package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호 짝 맞추기
// https://level.goorm.io/exam/43119/%EA%B4%84%ED%98%B8-%EC%A7%9D-%EB%A7%9E%EC%B6%94%EA%B8%B0/quiz/1
public class BraketMatch {
    private static int solution(String input) {
        char[] arr = input.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char ch : arr) {
            switch (ch) {
                case '[':
                    stack.push(1);
                    break;
                case '{':
                    stack.push(2);
                    break;
                case '(':
                    stack.push(3);
                    break;
                case ']':
                    if (stack.size() <= 0) return 1;
                    if (stack.pop() != 1) return 1;
                    break;
                case '}':
                    if (stack.size() <= 0) return 1;
                    if (stack.pop() != 2) return 1;
                    break;
                case ')':
                    if (stack.size() <= 0) return 1;
                    if (stack.pop() != 3) return 1;
                    break;
                default:
                    break;
            }
        }

        return stack.size();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()) > 0 ? "False" : "True");
    }
}
