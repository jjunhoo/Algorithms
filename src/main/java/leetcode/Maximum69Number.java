package leetcode;

// Maximum69Number
// https://leetcode.com/problems/maximum-69-number/
public class Maximum69Number {
    private static int maximum69Number(int num) {
        char[] charArrNum = String.valueOf(num).toCharArray();
        int size = charArrNum.length;

        for (int i = 0; i < size; i++) {
            if (charArrNum[i] == '6') {
                charArrNum[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(charArrNum));
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9999));
    }
}
