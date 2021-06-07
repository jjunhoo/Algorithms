package leetcode;

public class RestoreString {
    public static String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder();

        char[] chArr = s.toCharArray();

        for (int i=0; i<s.length(); i++) {
            sb.append(chArr[indices[i]]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = new int[]{ 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoreString(s, arr));

        String s1 = "aaiougrt";
        int[] arr1 = new int[]{ 4, 0, 2, 6, 7, 3, 1, 5 };
        System.out.println(restoreString(s1, arr1));
    }
}
