package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 단어의 개수 세기
// https://level.goorm.io/exam/47883/%EB%8B%A8%EC%96%B4%EC%9D%98-%EA%B0%9C%EC%88%98-%EC%84%B8%EA%B8%B0/quiz/1
public class WordCounting {
    private static void solution(String[] input) {
        int count = 0;
        for (int i=0; i<input.length; i++) {
            if (!"".equals(input[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine().split(" "));
    }
}
