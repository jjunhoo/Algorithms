package codility.sorting;

import java.util.Arrays;

// Triangle
// https://app.codility.com/programmers/lessons/6-sorting/triangle/
public class Triangle {
    private static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) { // 경우의 수
            // overflow 방지를 위한 long 타입 사용
            long a = A[i];
            long b = A[i + 1];
            long c = A[i + 2];

            if (a + b > c) {
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 10, 2, 5, 1, 8, 20 })); // 1 (true)
        System.out.println("[result] : " + solution(new int[]{ 10, 50, 5, 1 })); // 0 (false)
    }
}
