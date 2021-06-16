package leetcode;

import java.util.*;

public class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        List<Integer> list = new ArrayList();

        for (int i=0; i<accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            list.add(sum);
            sum = 0;
        }

        list.sort(Comparator.reverseOrder());

        return list.get(0);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{ {1,5}, {7,3}, {3,5} };
        MaximumWealth.maximumWealth(arr);
    }
}
