package leetcode;

// Maximum Number of Words Found in Sentences
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaximumNumberOfWordsFoundInSentences {
    private static int mostWordsFound(String[] sentences) {
        int result = 0;

        for (String word : sentences) {
            String[] splitWordArray = word.split(" ");
            result = splitWordArray.length > result ? splitWordArray.length : result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + mostWordsFound(new String[]{ "alice and bob love leetcode", "i think so too", "this is great thanks very much" })); // 6
        System.out.println("[result] : " + mostWordsFound(new String[]{ "please wait", "continue to fight", "continue to win" })); // 3
    }
}
