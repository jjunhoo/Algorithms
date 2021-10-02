package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 소수 판별
// https://level.goorm.io/exam/43238/%EC%86%8C%EC%88%98-%ED%8C%90%EB%B3%84/quiz/1
public class PrimeNumber {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println(count == 2 ? "True" : "False");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
