package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 약수의 합
// https://level.goorm.io/exam/43232/%EC%95%BD%EC%88%98%EC%9D%98-%ED%95%A9/quiz/1
public class SumOfFactors {
    private static void solution(int input) {
        int result = 0;

        for (int i=1; i<=input; i++) {
            if (input % i == 0) {
                result += i;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(Integer.parseInt(br.readLine()));
    }
}
