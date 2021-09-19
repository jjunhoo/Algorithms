package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 비트연산 기본 2
// https://level.goorm.io/exam/43173/%EB%B9%84%ED%8A%B8%EC%97%B0%EC%82%B0-%EA%B8%B0%EB%B3%B8-2/quiz/1
public class BitBasic2 {
    private static void solution(String input) {
        String[] str = input.split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.println(num1 >> num2);
        System.out.println(num1 << num2);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
