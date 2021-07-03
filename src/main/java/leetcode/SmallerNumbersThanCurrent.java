package leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int result = 0;
        int[] arr = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            // element 순서대로 추출
            int currentNumber = nums[i];
            for (int j=0; j<nums.length; j++) {
                // 현재 숫자는 제외
                if (currentNumber > nums[j]) {
                    result++;
                }
            }
            // 계산 결과 배열 할당
            arr[i] = result;
            // result 초기화
            result = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("result : " + Arrays.toString(smallerNumbersThanCurrent(new int[]{ 8, 1, 2, 2, 3 })));
    }
}
