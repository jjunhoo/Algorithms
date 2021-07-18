package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 마음대로 정렬하기
// https://programmers.co.kr/learn/courses/30/lessons/12915
public class StringCustomSorting {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);
                // n번째 문자가 같을 경우, 원본 String을 사전순으로 비교
                if (c1 == c2)
                    return s1.compareTo(s2);
                else
                    return c1 - c2;
            }
        });

        return strings;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println("[result] : " + Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }
}
