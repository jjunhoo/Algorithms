package leetcode;

public class ShuffleString {
    private static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i); // 각 문자를 indices 배열의 위치에 저장
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        System.out.println("[result] :: " + restoreString("codeleet", new int[]{ 4,5,6,7,0,2,1,3 }));
    }
}
