package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 가장 큰 수
// https://programmers.co.kr/learn/courses/30/lessons/42746?language=java
public class MaximumNumber {
    private static String solution(int[] numbers) {
        String answer = "";
        String[] str = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        // 문자열 비교
        // 내림차순 : (o2 + o1).compareTo(o1 + o2);
        // 오름차순 : (o1 + o2).compareTo(o2 + o1);
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 내림차순 결과값 첫번째가 0인 경우, 이후의 값도 0 이기 때문에 '0' 리턴
        if (str[0].equals("0")) {
            return "0";
        }

        for (String s : str) {
            answer += s;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 6, 10, 2 }));
        System.out.println("[result] : " + solution(new int[]{ 3, 30, 34, 5, 9 }));
    }
}
