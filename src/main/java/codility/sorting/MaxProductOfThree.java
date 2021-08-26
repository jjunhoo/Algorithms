package codility.sorting;

import java.util.Arrays;

// MaxProductOfThree
// https://app.codility.com/c/run/trainingWUNDWW-5QZ/
public class MaxProductOfThree {
    // 가장 큰 수를 만들 수 있는 숫자 3개를 곱한 값
    // 1. 양수 3개의 곱
    // 2. 음수 2개 * 양수 1개 곱
    public static int solution(int[] A) {
        // 배열 오름차순 정렬
        Arrays.sort(A);

        int positiveResult = A[A.length - 1] * A[A.length - 2] * A[A.length - 3]; // 양수 곱 결과
        int negativeResult = A[0] * A[1] * A[A.length - 1]; // 음수 + 양수 곱 결과

        // 최종값 리턴
        return positiveResult > negativeResult ? positiveResult : negativeResult;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{-3, 1, 2, -2, 5, 6})); // 60
        System.out.println("[result] : " + solution(new int[]{-5, 5, -5, 4})); // 125 ( -5 * -5 * 5 )
    }
}
