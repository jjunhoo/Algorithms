package codility.counting_elements;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
*/
public class PermCheck {
    // 주어진 배열이 순차 배열인지 확인
    public static int solution(int[] A) {
        // 배열 오름차순 정렬
        Arrays.sort(A);

        // LOOP용 i값과 배열값 비교
        for(int i = 0; i < A.length; i++) {
            // i가 0부터 시작이기 때문에 array index비교를 위해 1을 더함
            int comparisonNum = i + 1;
            // i와 array값이 다른 경우 0리턴
            if (comparisonNum != A[i]) {
                // 비순차배열
                return 0;
            }
        }
        // i와 array값이 다른 경우 1리턴 (순차 배열)
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,3,2};
        System.out.println(solution(arr));
    }
}
