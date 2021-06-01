package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList();

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));

        int[] nums2 = new int[]{ 3, 2, 4 };
        int target2 = 6;

        System.out.println(Arrays.toString(TwoSum.twoSum(nums2, target2)));

        int[] nums3 = new int[]{ 3, 3 };
        int target3 = 6;

        System.out.println(Arrays.toString(TwoSum.twoSum(nums3, target3)));
    }
}
