package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies {
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().orElseGet(() -> 0); // candies 배열 내 최대값

        for (int candy : candies) {
            result.add((max <= candy + extraCandies) ? Boolean.TRUE : Boolean.FALSE);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + kidsWithCandies(new int[]{ 2,3,5,1,3 }, 3));
        System.out.println("[result] : " + kidsWithCandies(new int[]{ 4,2,1,1,2 }, 1));
        System.out.println("[result] : " + kidsWithCandies(new int[]{ 12, 1, 12 }, 10));
    }
}
