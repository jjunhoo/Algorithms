package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열 번갈아 출력하기
// https://level.goorm.io/exam/43110/%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B2%88%EA%B0%88%EC%95%84-%EC%B6%9C%EB%A0%A5%ED%95%98%EA%B8%B0/quiz/1
public class PrintAlternatingStrings {
    private static void solution(String word) {
        char[] arr = word.toCharArray();
        int size = arr.length / 2;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            // 마지막인 경우, 한번 미출력
            if (i == size + 1) {
                break;
            } else {
                System.out.print(arr[arr.length - i - 1]);
            }
        }
        // 글자수가 홀수인 경우, 마지막 가운데 글자 추가 출력
        if (arr.length % 2 != 0) {
            System.out.println(arr[size]);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
