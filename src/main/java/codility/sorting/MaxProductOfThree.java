package codility.sorting;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
*/
public class MaxProductOfThree {
    // 가장 큰 수를 만들 수 있는 숫자 3개를 곱한 값
    public static int solution(int[] A) {
        // 배열 오름차순 정렬
        Arrays.sort(A);

        int result = 1;
        int count = 0;

        // 배열의 중간값부터 LOOP
        for (int i=A.length; i>0; i--) {
            if (count < 3) {
                // 중간 인덱스부터 마지막 인덱스까지의 값 곱하기
                result *= A[i-1];
            }
            count++;
        }
        // 최종값 리턴
        return result;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-3, 1, 2, -2, 5, 6};
        System.out.println(solution(arr));

        int arr2[] = new int[]{-5, 5, -5, 4}; // 125 ( -5 * -5 * 5 )
        System.out.println(solution(arr2));
    }
}
