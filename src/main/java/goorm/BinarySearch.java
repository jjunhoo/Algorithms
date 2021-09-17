package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Binary Search
// https://level.goorm.io/exam/43064/binary-search/quiz/1
public class BinarySearch {
    private static void solution(int[] elements, int searchValue) {
        boolean isSearch = Boolean.FALSE; // 찾는 값 검색 성공 여부

        int left = 0; // 배열의 첫번째 index
        int right = elements.length - 1; // 배열의 마지막 index
        int mid; // 배열의 중앙 index

        while (left <= right) {
            mid = (left + right) / 2; // 배열 중앙 index

            if (searchValue == elements[mid]) { // 찾는 값이 중앙 index 에 있는 경우
                System.out.println(mid + 1);
                isSearch = Boolean.TRUE;
                break;
            }

            if (searchValue < elements[mid]) { // 찾는 값이 중앙 index 의 값 보다 작은 경우, right - index 범위 재조정
                right = mid - 1;
            } else { // 찾는 값이 중앙 index 의 값 보다 큰 경우, left - index 범위 재조정
                left = mid + 1;
            }
        }

        if (Boolean.FALSE.equals(isSearch)) { // 찾는 값이 없는 경우, 'X' 출력
            System.out.println("X");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elementCount = Integer.parseInt(br.readLine()); // 배열 개수
        int[] elements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 배열 elements
        int searchValue = Integer.parseInt(br.readLine()); // 찾을 숫자
        solution(elements, searchValue);
    }
}
