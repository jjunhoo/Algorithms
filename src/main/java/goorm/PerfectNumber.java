package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 완전수
// https://level.goorm.io/exam/43275/%EC%99%84%EC%A0%84%EC%88%98/quiz/1
public class PerfectNumber {
    private static boolean isPerfectNumber(int number) {
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }

        return result == number;
    }

    private static void solution(String input) {
        int[] elements = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements
        int start = elements[0];
        int end = elements[1];

        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
