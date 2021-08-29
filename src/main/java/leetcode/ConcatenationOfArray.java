package leetcode;

import java.util.Arrays;

// leetcode
// https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationOfArray {
    private static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        for (int i=0; i<nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(getConcatenation(new int[]{ 1,2,1 }))); // [ 1,2,1,1,2,1 ]
        System.out.println("[result] : " + Arrays.toString(getConcatenation(new int[]{ 1,3,2,1 }))); // [ 1,3,2,1,1,3,2,1 ]
    }
}
