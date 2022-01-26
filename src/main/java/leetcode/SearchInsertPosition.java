package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Search Insert Position
// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    private static int searchInsert(int[] nums, int target) {
        List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int result = 0;

        if (intList.contains(target)) {
            return intList.indexOf(target);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) break;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + searchInsert(new int[]{ 1,3,5,6 }, 5)); // 2
        System.out.println("[result] : " + searchInsert(new int[]{ 1,3,5,6 }, 2)); // 1
        System.out.println("[result] : " + searchInsert(new int[]{ 1,3,5,6 }, 7)); // 4
    }
}
