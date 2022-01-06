package leetcode;

public class JewelsAndStones {
    private static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        char[] stone = stones.toCharArray();

        for (char ch : stone) {
            if (jewels.contains(String.valueOf(ch))) {
                result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println("[result] : " + numJewelsInStones("z", "ZZ")); // 0
    }
}
