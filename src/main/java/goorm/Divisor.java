package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 약수 구하기
// https://level.goorm.io/exam/43255/%EC%95%BD%EC%88%98-%EA%B5%AC%ED%95%98%EA%B8%B0/quiz/1
public class Divisor {
    private static void solution(String input) {
        int num = Integer.parseInt(input);

        for (int i=1; i<=num; i++) {
            if (num % i == 0)  {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);
        solution(input);
    }
}
