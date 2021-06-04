package codility.stack_and_queues;

import java.util.Stack;

/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
*/
public class Brackets {
    // 스택에서 pop할 경우, 짝이 맞지 않는 경우 0 return, 맞는 경우 1 return
    public static int solution(String S) {
        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        // String 문자열 -> Char Array로 분리 및 문자 비교
        for(char character : S.toCharArray()) {
            switch(character) {
                case '(':
                    // '(' 인 경우, 1 push
                    stack.push(1);
                    break;
                case '{':
                    // '{' 인 경우, 2 push
                    stack.push(2);
                    break;
                case '[':
                    // '[' 인 경우, 3 push
                    stack.push(3);
                    break;
                case ')':
                    // 스택에 데이터가 없는 경우
                    if (stack.size() <= 0) return 0;
                    // 스택 맨 위에서 꺼낸 데이터가 '('가 아닐 경우
                    if (stack.pop() != 1) return 0;
                    break;
                case '}':
                    // 스택에 데이터가 없는 경우
                    if (stack.size() <= 0) return 0;
                    // 스택 맨 위에서 꺼낸 데이터가 '{'가 아닐 경우
                    if (stack.pop() != 2) return 0;
                    break;
                case ']':
                    // 스택에 데이터가 없는 경우
                    if (stack.size() <= 0) return 0;
                    // 스택 맨 위에서 꺼낸 데이터가 '['가 아닐 경우
                    if (stack.pop() != 3) return 0;
                    break;
            }
        }
        // 스택에 데이터가 남아있는 경우 0 리턴
        if (stack.size() > 0) {
            return 0;
        }
        // 스택이 깔끔하게 빈 경우 1리턴
        return 1;
    }
    public static void main(String[] args) {
        String arr = "{[()()]}";
        System.out.println(solution(arr));
    }

}
