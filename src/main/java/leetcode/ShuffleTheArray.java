package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        // n * 2 만큼의 배열 선언
        int[] arr = new int[n * 2];

        for (int i=0; i<n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ShuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println(Arrays.toString(ShuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
        System.out.println(Arrays.toString(ShuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2)));
    }
}
