package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 절대값
// https://level.goorm.io/exam/43117/%EC%A0%88%EB%8C%80%EA%B0%92/quiz/1
public class AbsoluteValue {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        System.out.println(Math.abs(num));
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
