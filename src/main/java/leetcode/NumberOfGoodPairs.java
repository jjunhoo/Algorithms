package leetcode;

// Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    private static int numIdenticalPairs(int[] nums) {
        int result = 0;
        int count[] = new int[101];

        for (int num : nums) {
            System.out.print("count :: " + count[num]);
            result += count[num]++;
            System.out.print(" result :: " + result);
            System.out.println();
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + numIdenticalPairs(new int[]{ 1,2,3,1,1,3 }));
        System.out.println("[result] : " + numIdenticalPairs(new int[]{ 1,1,1,1 }));
        System.out.println("[result] : " + numIdenticalPairs(new int[]{ 1,2,3 }));
    }
}
