package leetcode;

// Sorting the Sentence
// https://leetcode.com/problems/sorting-the-sentence/
public class SortingTheSentence {
    private static String sortSentence(String s) {
        String[] splitArr = s.split(" ");
        String[] result = new String[splitArr.length];
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<splitArr.length; i++) {
            int idx = Character.getNumericValue(splitArr[i].charAt(splitArr[i].length() - 1)) - 1; // idx 로 사용할 문자열에 포함된 숫자 추출
            if (idx == splitArr.length - 1) { // 마지막 idx 문자인 경우, 공백 제거
                result[idx] = splitArr[i].substring(0, splitArr[i].length() - 1);
            } else { // 마지막 idx 문자가 아닌 경우, 공백 추가
                result[idx] = splitArr[i].substring(0, splitArr[i].length() - 1) + " ";
            }
        }

        for (int i=0; i<result.length; i++) {
            sb.append(result[i]);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + sortSentence("is2 sentence4 This1 a3"));
    }
}
