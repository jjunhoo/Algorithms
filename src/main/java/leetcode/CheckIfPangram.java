package leetcode;

import java.util.TreeSet;

public class CheckIfPangram {
    public static boolean checkIfPangram(String sentence) {
        TreeSet tree = new TreeSet();

        char[] arr = sentence.toCharArray();

        for (char ch : arr) {
            tree.add(ch);
        }

        return (tree.size() == 26) ? true : false;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("[ ] : " + checkIfPangram(sentence));

        String sentence2 = "leetcode";
        System.out.println("[ ] : " + checkIfPangram(sentence2));
    }
}
