package programmers;

import java.util.Arrays;

// 완료하지 못한 선수
// https://programmers.co.kr/learn/courses/30/lessons/42576
public class NotCompletePlayers {
    private static String solution(String[] participant, String[] completion) {
        int iterator;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (iterator = 0; iterator < completion.length; iterator++) {
            // 참가자와 완주한 선수 이름을 비교한 결과, 중간에 다른 이름이 있는 경우, 해당 순서의 참가자 이름 return
            if (!participant[iterator].equals(completion[iterator])) {
                return participant[iterator];
            }
        }

        // 참가자 이름 순서상 맨 뒤인 경우, 마지막 순서에 있는 참가자 return
        return participant[iterator];
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new String[]{ "leo", "kiki", "eden" }, new String[]{ "eden", "kiki" } ));
        System.out.println("[result] : " + solution(new String[]{ "marina", "josipa", "nikola", "vinko", "filipa" }, new String[]{ "josipa", "filipa", "marina", "nikola" } ));
        System.out.println("[result] : " + solution(new String[]{ "mislav", "stanko", "mislav", "ana" }, new String[]{ "stanko", "ana", "mislav" } ));
    }
}
