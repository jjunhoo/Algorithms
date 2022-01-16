package leetcode;

import java.util.Arrays;

// Count Number of Pairs With Absolute Difference K
// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    private static int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[j]) - Math.abs(nums[i]) == k) {
                    result++;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + countKDifference(new int[]{ 1,2,2,1 } , 1)); // 4
        System.out.println("[result] : " + countKDifference(new int[]{ 1,3 } , 3)); // 0
        System.out.println("[result] : " + countKDifference(new int[]{ 3,2,1,5,4 } , 2)); // 3
    }
}
