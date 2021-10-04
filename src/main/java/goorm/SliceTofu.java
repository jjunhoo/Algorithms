package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 두부 자르기
// https://level.goorm.io/exam/49106/%EB%91%90%EB%B6%80-%EC%9E%90%EB%A5%B4%EA%B8%B0/quiz/1
public class SliceTofu {
    private static void solution(int number) {
        System.out.println(number - 3);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(Integer.parseInt(br.readLine()));
    }
}
