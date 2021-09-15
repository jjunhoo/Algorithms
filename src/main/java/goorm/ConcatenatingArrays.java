package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 배열 합치기
// https://level.goorm.io/exam/43250/%EB%B0%B0%EC%97%B4-%ED%95%A9%EC%B9%98%EA%B8%B0/quiz/1
public class ConcatenatingArrays {
    private static void solution(int[] arr1, int[] arr2) {
        int idx = 0;
        int size = arr1.length + arr2.length;
        int[] arr = new int[size];

        // arr1 -> arr 적재
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        // arr2 -> arr 적재
        for (int i = arr1.length; i < arr.length; i++) {
            arr[i] = arr2[idx++];
        }

        Arrays.sort(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] elementSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements 사이즈
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements 1
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements 2
        solution(arr1, arr2);
    }
}
