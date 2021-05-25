package testdome;

public class Palindrome {
    // 펠린드롬 문자열 여부 확인
    public static boolean isPalindrome(String word) {
        final String lowerCaseWord = word.toLowerCase();
        final int size = word.length();

        for (int i=0; i<size; i++) {
            // 첫 문자와 마지막 문자를 비교 후 다르다면 return false
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("[isPalindrome] : " + Palindrome.isPalindrome("Kayak"));
    }
}
