package leetcode;

// leetcode
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }

        return index;
    }
    public static void main(String[] args) {
        // before - [1, 1, 2]
        // after - [1, 2, 2]
        System.out.println("[result] : " + removeDuplicates(new int[]{ 1,1,2 })); // 2
        // before - [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        // after - [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
        System.out.println("[result] : " + removeDuplicates(new int[]{ 0,0,1,1,1,2,2,3,3,4 })); // 5
    }
}
