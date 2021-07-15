package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 나누어 떨어지는 숫자 배열
// https://programmers.co.kr/learn/courses/30/lessons/12910
public class DivisorNumberArray {
    public static int[] solution(int[] arr, int divisor) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int num : arr) {
            if (num % divisor == 0) {
                queue.add(num);
            }
        }

        int[] answer;
        if (!queue.isEmpty()) {
            answer = new int[queue.size()];

            for (int i=0; i<answer.length; i++) {
                answer[i] = queue.poll();
            }
            Arrays.sort(answer);
        } else {  // 하나도 없는 경우
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString((solution(new int []{5, 9, 7, 10}, 5))));
        System.out.println("[result] : " + Arrays.toString((solution(new int []{2, 36, 1, 3}, 1))));
        System.out.println("[result] : " + Arrays.toString((solution(new int []{3,2,6}, 10))));
    }
}
