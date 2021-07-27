package programmers;

import java.util.Arrays;
import java.util.TreeSet;

// 전화번호 목록
// https://programmers.co.kr/learn/courses/30/lessons/42577
public class PhoneNumberList {
    private static boolean solution(String[] phone_book) {
        boolean answer = true;

        // 배열 길이 validation
        if (phone_book.length < 1 || phone_book.length > 1000000) {
            return false;
        }

        TreeSet tree = new TreeSet();

        for (int i=0; i<phone_book.length; i++) {
            tree.add(phone_book[i]);
        }

        // 전화번호 중복 여부 validation
        if (phone_book.length != tree.size()) {
            return false;
        }

        // 배열 sort
        Arrays.sort(phone_book);

        for (int i=0; i<phone_book.length - 1; i++) {
            // 2번째 문자열의 prefix 가 1번째 문자열로 시작하는지 확인
            // 배열이 오름차순으로 정렬되어 있기 때문에 1번, 2번 배열만 확인해보면 됨
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = Boolean.FALSE;
                break;
            }
        }

        return answer;
    }
    private static boolean solution2(String[] phone_book) {
        boolean answer = true;

        // 배열 길이 validation
        if (phone_book.length < 1 || phone_book.length > 1000000) {
            return false;
        }

        TreeSet tree = new TreeSet();

        for (int i=0; i<phone_book.length; i++) {
            tree.add(phone_book[i]);
        }

        // 전화번호 중복 여부 validation
        if (phone_book.length != tree.size()) {
            return false;
        }

        // 배열 sort
        Arrays.sort(phone_book);

        for (int i=0; i<phone_book.length; i++) {
            String temp = phone_book[i];
            for (int j=0; j<phone_book.length; j++) {
                // 비교 기준 - 자기 자신 제외
                if (phone_book[j].equals(temp)) {
                    continue;
                }
                // 문자열 prefix 포함 여부 확인
                if (phone_book[i].startsWith(phone_book[j])) {
                    answer = Boolean.FALSE;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new String[]{ "119", "97674223", "1195524421" }));
        System.out.println("[result] : " + solution(new String[]{ "123", "456", "789" }));
        System.out.println("[result] : " + solution(new String[]{ "12", "123", "1235", "567", "88" }));
    }
}
