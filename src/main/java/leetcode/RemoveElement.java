package leetcode;

// leetcode
// https://leetcode.com/problems/remove-element/
public class RemoveElement {
    private static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) { // 배열의 값이 val 이 아닐 경우, 0번째 배열부터 val이 아닌 값 저장
                nums[index++] = nums[i];
            }
        }

        return index;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + removeElement(new int[]{ 3,2,2,3 }, 3)); // 2
        System.out.println("[result] : " + removeElement(new int[]{ 0,1,2,2,3,0,4,2 }, 2)); // 5
    }
}
