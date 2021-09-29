package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// N 구하기
// https://level.goorm.io/exam/43264/n-%EA%B5%AC%ED%95%98%EA%B8%B0/quiz/1
public class FindN {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        int sum = 0;

        for (int i=1; i<num; i++) {
            if (sum > num) {
                System.out.println(i - 1);
                break;
            }
            sum += i;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
