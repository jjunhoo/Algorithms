package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 팩토리얼
// https://level.goorm.io/exam/43192/factorial-%EA%B3%84%EC%8A%B9/quiz/1
public class Factorial {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        long result = 1;

        for (int i=1; i<=num; i++) {
            result *= i;
        }

        System.out.println(result);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
