package testdome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static Map<Integer, Integer> numberPosition;

    public static int[] findTwoSum(int[] list, int sum) {
        numberPosition = new HashMap<>();

        System.out.println("[list] : " + Arrays.toString(list));
        System.out.println("[sum] : " + sum);

        if (list == null || list.length <= 1) {
            return null;
        }

        for (int i = 0; i < list.length; i++) {
            int toRetrieve = sum - list[i];
            System.out.println("[i] : " + i + " / [toRetrieve] : " + toRetrieve);

            if (numberPosition.containsKey(toRetrieve)) {
                if (toRetrieve + list[i] == sum) {
                    System.out.println("[init]");
                    return new int[]{numberPosition.get(toRetrieve), i};
                }
            }
            System.out.println("[list[" + i + "]] : " + list[i] + " / i : " + i);
            numberPosition.put(list[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
