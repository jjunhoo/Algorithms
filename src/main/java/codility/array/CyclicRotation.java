package codility.array;

import java.util.Arrays;

// CyclicRotation
// https://app.codility.com/c/run/training74VYR6-7SP/
public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i=0; i<A.length; i++) {
            int index = (i + K); // Shift 할 인덱스 계산

            if (index >= A.length) { // 인덱스 범위를 넘어가는 경우, 배열의 길이를 기준으로 모듈러 연산을 통해 해당 위치에 저장
                result[index % A.length] = A[i];
            } else {
                result[index] = A[i]; // 인덱스 범위 내라면, 해당 위치에 저장
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 3,8,9,7,6 }, 3))); // [9, 7, 6, 3, 8]
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 0,0,0 }, 1))); // [0, 0, 0]
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 1,2,3,4 }, 4))); // [1, 2, 3, 4]
    }
}
