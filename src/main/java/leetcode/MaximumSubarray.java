package leetcode;

// Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    private static int maxSubArray(int[] nums) {
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + maxSubArray(new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
        // System.out.println("[result] : " + maxSubArray(new int[]{ 1 }));
        // System.out.println("[result] : " + maxSubArray(new int[]{ 5, 4, -1, 7, 8 }));
    }
}
