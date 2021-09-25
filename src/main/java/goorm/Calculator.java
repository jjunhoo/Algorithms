package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 계산기
// https://level.goorm.io/exam/43241/%EA%B3%84%EC%82%B0%EA%B8%B0/quiz/1
public class Calculator {
    private static void solution(String input) {
        String[] arr = input.split(" ");
        String operator = arr[1];
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(String.format("%.2f", (double)num1 / (double)num2)); // 소수점 둘째 자리까지 표시
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
