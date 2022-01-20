package leetcode;

import java.util.Arrays;

// Sum of All Odd Length Subarrays
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOddLengthSubarrays {
    private static int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        Boolean isOdd = length % 2 == 0 ? Boolean.FALSE : Boolean.TRUE; // 배열 길이를 통해 홀짝 판별

        int result = Arrays.stream(arr).sum() * 2; // 배열 총합

        if (isOdd && length > 3) {
            for (int i = 0; i < length; i++) {
                for (int j = i; j < length; j++) {
                    if ((j - i + 1) % 2 == 1) {
                        result += arr[j];
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + sumOddLengthSubarrays(new int[]{ 1,4,2,5,3 })); // 58
        System.out.println("[result] : " + sumOddLengthSubarrays(new int[]{ 1,2 })); // 3
        System.out.println("[result] : " + sumOddLengthSubarrays(new int[]{ 10,11,12 })); // 66
    }
}
