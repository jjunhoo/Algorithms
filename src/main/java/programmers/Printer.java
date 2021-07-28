package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

// 프린터
// https://programmers.co.kr/learn/courses/30/lessons/42587
public class Printer {
    private static int solution(int[] priorities, int location) {
        int answer = 1;
        // Collections.reverseOrder() 를 통해 우선순위 큐의 우선순위를 큰값을 기준으로 삽입
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            heap.add(priority);
        }

        // heap 순회
        while (!heap.isEmpty()) {
            // 배열 순회
            for (int i=0; i<priorities.length; i++) {
                // heap 에서 peek 한 값(현재 heap 값)과 priorities 의 element 값을 순서대로 비교
                if (heap.peek() == priorities[i]) {
                    // 현재 순서(index)가 location 값과 일치하는지 확인
                    if (i == location) {
                        return answer;
                    }
                }
                // heap 에서 peek 한 값과 priorities 의 element 값이 일치하지만, location 이 다른 경우, heap - poll
                heap.poll();
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 2,1,3,2 }, 2));
        System.out.println("[result] : " + solution(new int[]{ 1,1,9,1,1,1 }, 0));
    }
}
