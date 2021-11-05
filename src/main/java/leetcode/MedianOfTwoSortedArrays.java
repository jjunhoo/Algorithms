package leetcode;

import java.util.Arrays;

// leetcode
// https://leetcode.com/problems/median-of-two-sorted-arrays/
// * input parameter 인 2개의 배열은 sort 되어 있음
public class MedianOfTwoSortedArrays {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

        Arrays.sort(result);

        // 배열 element 가 모두 '0' 인 경우, 0 리턴
        if (result[result.length - 1] == 0) {
            return 0;
        }
        // 배열 element 개수가 1개인 경우, 첫번째 배열 요소 리턴
        if (result.length == 1) {
            return (double) result[0];
        }
        // 배열 element 개수가 2개인 경우, 2개의 element 평균 리턴
        if (result.length == 2) {
            return (double)(result[0] + result[1]) / 2;
        }

        return result.length % 2 == 0 ? (double)(result[result.length / 2 - 1] + result[result.length / 2]) / 2 : (double)result[result.length / 2];
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + findMedianSortedArrays(new int[]{ 1,3 }, new int[]{ 2 })); // 2.00000
        System.out.println("[result] : " + findMedianSortedArrays(new int[]{ 1,2 }, new int[]{ 3,4 })); // 2.50000
    }
}
