package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Min 함수
// https://level.goorm.io/exam/43273/min-%ED%95%A8%EC%88%98/quiz/1
public class MinFunction {
    private static void solution(String input) {
        String[] str = input.split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        System.out.println(num1 > num2 ? num2 : num1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
