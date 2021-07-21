package programmers;

import java.util.Arrays;

// 제일 작은 수 제거하기
// https://programmers.co.kr/learn/courses/30/lessons/12935
public class TheSmallestNumberDelete {
    private static int[] solution(int[] arr) {
        // 배열 정렬
        Arrays.sort(arr);

        // 배열 개수가 1개인 경우, -1 리턴
        if (arr.length == 1) {
            return new int[]{ -1 };
        }

        // 파라미터로 전달 받은 배열의 개수보다 1개 작은 크기만큼 생성
        int[] result = new int[arr.length - 1];
        // 1번째 index 는 가장 작은 수 이므로 2번째 index 부터 추가
        for (int i=0; i<arr.length - 1; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{ 4,3,2,1 }))); // [ 4,3,2 ]
        System.out.println(Arrays.toString(solution(new int[]{ 10 }))); // [ -1 ]
    }
}
