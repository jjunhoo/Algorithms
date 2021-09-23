package codility.time_complexity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TapeEquilibrium
// https://app.codility.com/c/run/trainingJYQVAR-YJT/
// 참고 : https://cchoimin.tistory.com/entry/Codility-TapeEquilibrium-100%EC%A0%90
public class TapeEquilibrium {
    private static int solution(int[] A) {
        List<Integer> listOfSum = new ArrayList();
        int left = 0;
        int right = 0;
        int sum = 0;

        for (int element : A) {
            sum += element;
        }

        for (int i = 0; i < A.length - 1; i++) { // 경우의 수
            left += A[i]; // 좌측 그룹 계산 (좌측부터 index +1 씩 누적)
            right = sum - left; // 우측 그룹 계산 (총합 - 좌측 그룹)
            listOfSum.add(Math.abs(left - right)); // 절대값 계산 결과 ArrayList 적재
        }

        return Collections.min(listOfSum); // 최소값 추출
    }
    // 정확성 : 100, 퍼포먼스 : 0
    private static int original(int[] A) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            int sumOfA = 0;
            int sumOfB = 0;
            // A 그룹 계산
            for (int j = 0; j <= i; j++) {
                sumOfA += A[j];
            }
            // B 그룹 계산
            for (int k = i + 1; k < A.length; k++) {
                sumOfB += A[k];
            }

            // 절대값이 더 큰 값에서 작은 값 빼기
            // int calculate = Math.abs(sumOfA) > Math.abs(sumOfB) ? Math.abs(sumOfA) - Math.abs(sumOfB) : Math.abs(sumOfB) - Math.abs(sumOfA);
            int calculate = Math.abs(sumOfA - sumOfB);
            // 차이가 작은 숫자 갱신
            result = result > calculate ? calculate : result;
        }

        return result;
    }
    public static void main(String[] args) {
        // System.out.println("[result] : " + solution(new int[]{ 3,1,2,4,3 })); // 1
        System.out.println("[result] : " + solution(new int[]{ -1000,1000 }));
    }
}
