package leetcode;

import java.util.Arrays;

// leetcode
// https://leetcode.com/problems/build-array-from-permutation/
public class BuildArrayFromPermutation {
    private static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(buildArray(new int[]{ 0,2,1,5,3,4 }))); // [ 0,1,2,4,5,3 ]
        System.out.println("[result] : " + Arrays.toString(buildArray(new int[]{ 5,0,1,2,3,4 }))); // [ 4,5,0,1,2,3 ]
    }
}
