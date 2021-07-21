package programmers;

// 자릿수 더하기
// https://programmers.co.kr/learn/courses/30/lessons/12931
public class TheAddDigit {
    private static int solution(int n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int result = 0;

        for (char ch : arr) {
            result += Character.getNumericValue(ch);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(123)); // 6
        System.out.println("[result] : " + solution(987)); // 24
    }
}
