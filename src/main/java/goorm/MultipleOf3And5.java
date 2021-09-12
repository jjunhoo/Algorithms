package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 3과 5의 배수
// https://level.goorm.io/exam/43166/3%EA%B3%BC-5%EC%9D%98-%EB%B0%B0%EC%88%98/quiz/1
public class MultipleOf3And5 {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        int sum = 0;

        if (num > 1000) {
            System.out.println("Invalid");
            System.exit(1);
        }

        for (int i=1; i<=num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solution(input);
    }
}
