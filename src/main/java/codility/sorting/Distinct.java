package codility.sorting;

import java.util.HashSet;

// Distinct
// https://app.codility.com/c/run/trainingJSY5XT-WYU/
public class Distinct {
    private static int solution(int[] A) {
        HashSet set = new HashSet();

        for (int num : A) { set.add(num); }

        return set.size();
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 2,1,1,2,3,1 }));
    }
}
