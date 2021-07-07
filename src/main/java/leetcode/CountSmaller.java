package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// TODO : Time Limit Exceed
public class CountSmaller {
    private static List<Integer> countSmaller(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            int currentNumber = nums[i]; // 현재 element
            for (int j=i+1; j<nums.length; j++) {
                if (currentNumber > nums[j]) {
                    result++;
                    hashMap.put(nums[i], result);
                }
            }
            list.add(result);
            result = 0;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("[] : " + countSmaller(new int[]{ 5,2,6,1 }));
        System.out.println("[] : " + countSmaller(new int[]{ -1 }));
        System.out.println("[] : " + countSmaller(new int[]{ -1, -1 }));
    }
}
