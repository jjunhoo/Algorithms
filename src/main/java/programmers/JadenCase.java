package programmers;

import java.util.StringJoiner;
import java.util.regex.Pattern;

// JadenCase 문자열 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12951
public class JadenCase {
    private static String solution(String str) {
        // 공백을 기준으로 split 후 배열 생성
        String[] arr = str.toLowerCase().split(" ");
        // " " delimiter - StringJoiner 생성
        StringJoiner answer = new StringJoiner(" ");

        // 배열 element 의 첫글자를 대문자로 변환하고, 추출한 뒤 나머지 뒷 문자열은 소문자로 변환 후 앞 문자열과 합치기
        for (String string : arr) {
            if (string.length() == 1) { // 문자열이 1글자인 경우, 해당 글자만 바로 대문자 변환 후 StringJoiner 추가
                answer.add(String.valueOf(string.toUpperCase().charAt(0)));
            } else if ("".equals(string)) { // 문자열이 공백인 경우, 해당 공백 추가
                answer.add(string);
            } else if (Pattern.matches("^[a-z]*$", string.substring(0, 1))) { // 첫번째 문자가 영문인 경우
                answer.add(string.toUpperCase().charAt(0) + string.substring(1));
            } else { // 나머지 케이스인 경우
                answer.add(string.toLowerCase());
            }
        }

        // 마지막 배열 element 의 문자열 끝이 공백인 경우는 출력
        if (" ".equals(str.substring(str.length() - 1))) {
            answer.add("");
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution("3people unFollowed me")); // 3people Unfollowed Me
        System.out.println("[result] : " + solution("for the last week")); // For The Last Week
        System.out.println("[result] : " + solution("3a333 3a3 3a33 ") + "/"); //
    }
}
