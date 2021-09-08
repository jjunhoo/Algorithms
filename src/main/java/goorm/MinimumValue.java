package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 최소값
// https://level.goorm.io/exam/43125/%EC%B5%9C%EC%86%8C%EA%B0%92/quiz/1
public class MinimumValue {
    private static void solution(String[] str) {
        int[] result = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        System.out.println(result[0]);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int size = Integer.parseInt(br.readLine());
            solution(br.readLine().split(" "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input Value");
        }
    }
}
