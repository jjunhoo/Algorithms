package leetcode;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (i == 0) {
                result[i] = nums[i];
            } else {
                result[i] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("" + runningSum(new int[]{ 1,2,3,4 }));
        // System.out.println("" + runningSum(new int[]{ 1,1,1,1,1 }));
        // System.out.println("" + runningSum(new int[]{ 3,1,2,10,1 }));
    }
}
