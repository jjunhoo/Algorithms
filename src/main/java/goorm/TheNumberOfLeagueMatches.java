package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 리그 경기 횟수 구하기
// https://level.goorm.io/exam/43092/%EB%A6%AC%EA%B7%B8-%EA%B2%BD%EA%B8%B0-%ED%9A%9F%EC%88%98-%EA%B5%AC%ED%95%98%EA%B8%B0/quiz/1
public class TheNumberOfLeagueMatches {
    private static void solution(String input) {
        int numberOfTeam = Integer.parseInt(input);
        int result = 0;

        for (int i=1; i<numberOfTeam; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
