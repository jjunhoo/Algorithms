package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class SubtractProductAndSum {

    private static int subtractProductAndSum(int n) {
        // int 한글자씩 slice 후 int array 변환
        int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        // 각 자리수 곱하기
        int multiply = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        // 각 자리수 더하기
        int plus = Arrays.stream(arr).sum();

        return multiply - plus;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + subtractProductAndSum(234));
        System.out.println("[result] : " + subtractProductAndSum(4421));
    }
}
