package programmers;

import java.util.Arrays;
import java.util.LinkedList;

// 모의고사
// https://programmers.co.kr/learn/courses/30/lessons/42840
public class MockExam {
    private static int[] people1 = new int[]{ 1, 2, 3, 4, 5 };
    private static int[] people2 = new int[]{ 2, 1, 2, 3, 2, 4, 2, 5 };
    private static int[] people3 = new int[]{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

    private static int[] solution(int[] answers) {
        // 최대 10,000 문제
        int maxScore = 0;
        int PEOPLE1_SCORE = 0;
        int PEOPLE2_SCORE = 0;
        int PEOPLE3_SCORE = 0;

        LinkedList<Integer> answerList = new LinkedList();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == people1[i % 5]) {
                PEOPLE1_SCORE++;
            }
            if (answers[i] == people2[i % 8]) {
                PEOPLE2_SCORE++;
            }
            if (answers[i] == people3[i % 10]) {
                PEOPLE3_SCORE++;
            }
        }

        // 가장 많이 맞힌 사람 (다수인 경우, 오름차순)
        // 랭킹
        if (PEOPLE1_SCORE > PEOPLE2_SCORE) {
            maxScore = PEOPLE1_SCORE;
        } else {
            maxScore = PEOPLE2_SCORE;
        }

        if (PEOPLE3_SCORE > maxScore) {
            maxScore = PEOPLE3_SCORE;
        }

        // 1위 선발
        if (maxScore == PEOPLE1_SCORE) answerList.add(1);
        if (maxScore == PEOPLE2_SCORE) answerList.add(2);
        if (maxScore == PEOPLE3_SCORE) answerList.add(3);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 1,2,3,4,5 }))); // [1]
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 1,3,2,4,2 }))); // [1,2,3]
    }
}
