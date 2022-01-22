package myrealtrip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class myrealtrip1 {
    public static char solution(int[] arr, int searchValue) {
        int mid;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { // 좌측의 값이 우측과 같아지면 모두 탐색
            mid = (left + right) / 2; // 중간 위치

            if (searchValue == arr[mid]) {
                return Integer.toString(mid + 1).charAt(0);
            }
            if (searchValue > arr[mid]) { // 찾는 값이 더 큰 경우
                left = mid + 1; // left 를 현재 mid 값보다 + 1 한 값으로 이동
            } else {
                right = mid - 1; // right 를 현재 mid 값보다 - 1 한 값으로 이동
            }
        }
        return 'X';
    }

    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 배열 크기
            String count = br.readLine();
            // 배열 element
            String element = br.readLine();
            // 찾을 숫자
            String value = br.readLine();

            String[] str = element.split(" ");

            int arrSize = Integer.parseInt(count);
            int arrElementSize = str.length;

            // 개수가 다른 경우
            if (arrSize != arrElementSize || arrSize > 100) {
                System.out.println("배열 입력 크기와 배열 element 개수 불일치 또는 배열 크기는 100을 초과 할 수 없습니다.");
            } else {
                int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
                int searchValue = Integer.parseInt(value);

                // solution(arr, searchValue);
                System.out.println("[result] : " + solution(arr, searchValue));
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
    }
}
