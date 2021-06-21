package leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
    public static void main(String[] args) {
        System.out.println(PalindromeNumber.isPalindrome(121));
        System.out.println(PalindromeNumber.isPalindrome(-121));
        System.out.println(PalindromeNumber.isPalindrome(10));
        System.out.println(PalindromeNumber.isPalindrome(-101));
    }
}
