package leetcode;

// XOR Operation in an Array
// https://leetcode.com/problems/xor-operation-in-an-array/
public class XOROperationInAnArray {
    private static int xorOperation(int n, int start) {
        int result = start;

        for (int i = 1; i < n; i++) {
            result = result ^ (start + 2 * i);
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + xorOperation(5, 0));
        System.out.println("[result] : " + xorOperation(4, 3));
    }
}
