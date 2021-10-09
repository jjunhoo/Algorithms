package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 특정 구간의 합
// https://level.goorm.io/exam/43263/%ED%8A%B9%EC%A0%95-%EA%B5%AC%EA%B0%84%EC%9D%98-%ED%95%A9/quiz/1
public class SumOfCertainSections {
    private static void solution(int[] elements, int[] certainSections) {
        int sum = 0;

        for (int i=certainSections[0] - 1; i<=certainSections[1] - 1; i++) {
            sum += elements[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] elements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements
        int[] certainSections = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 합을 구하고자 하는 구간
        solution(elements, certainSections);
    }
}
