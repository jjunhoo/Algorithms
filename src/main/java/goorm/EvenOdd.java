package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 홀짝 판별
// https://level.goorm.io/exam/43111/%ED%99%80%EC%A7%9D-%ED%8C%90%EB%B3%84/quiz/1
public class EvenOdd {
    private static void solution(String input) {
        int num = Integer.parseInt(input);
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
