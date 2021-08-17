package codility.time_complexity;

import java.util.Arrays;

// PermMissingElem
// https://app.codility.com/c/run/training4FEZ4A-KT2/
public class PermMissingElem {
    public static int solution(int[] A) {
        // 배열 오름차순 정렬
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1; // 모두 같은 경우, 다음 숫자 리턴
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 2,3,1,5 })); // 4
        System.out.println("[result] : " + solution(new int[]{ 2,3,1,4 })); // 5
    }
}
