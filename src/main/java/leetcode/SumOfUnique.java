package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int result = 0;

        for (int num : nums) {
            // hm.getOrDefault(num, 0) + 1
            // num 값이 있으면, 해당 num 값 + 1 put, 없다면 0 + 1 put
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            System.out.println("[" + num + "] : " + hm.get(num));
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            // value 값이 1인 (unique) 값들만 key 값을 sum
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(" " + sumOfUnique(new int[]{ 1,2,3,2 }));
        System.out.println(" " + sumOfUnique(new int[]{ 1,1,1,1,1 }));
        System.out.println(" " + sumOfUnique(new int[]{ 1,2,3,4,5 }));
    }
}
