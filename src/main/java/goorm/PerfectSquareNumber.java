package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 완전제곱수
// https://level.goorm.io/exam/43152/%EC%99%84%EC%A0%84-%EC%A0%9C%EA%B3%B1%EC%88%98/quiz/1
// 참고 : https://www.scienceall.com/%EC%99%84%EC%A0%84%EC%A0%9C%EA%B3%B1%EC%88%98perfect-square-number/
public class PerfectSquareNumber {
    private static void solution(List<Integer> list) {
        int result = 0;

        for (int number : list) {
            for (int j = 1; j < 100; j++) {
                int pow = (int) Math.pow(j, 2);
                if (number == pow) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList();

        for (int i=0; i<count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        solution(list);
    }
}
