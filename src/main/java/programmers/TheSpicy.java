package programmers;

import java.util.PriorityQueue;

// 더 맵게
// https://programmers.co.kr/learn/courses/30/lessons/42626
/* PriorityQueue
   - 먼저 들어온 순서대로 데이터가 나가는 것이 아니라 우선순위를 먼저 결정하고, 그 우선순위가 높은 엘리먼트가 먼저 나가는 자료구조
   - 우선순위 큐는 힙을 이용하여 구현하는 것이 일반적
 */
public class TheSpicy {
    // Validation
    private static int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 우선순위 큐에 배열값 삽입
        for (int scovilleValue : scoville) {
            heap.add(scovilleValue);
        }

        // 우선순위 큐에서 peek (우선순위가 제일 높은 값 : 배열 내 제일 작은 값) 한 값이 k 보다 작은 경우
        while (heap.peek() <= k) {
            // 제일 작은 값을 peek 했는데, 우선순위 큐의 사이즈가 1개인 경우 -1 return
            if (heap.size() == 1) {
                return -1;
            }
            // 배열 내 작은값 순서대로 2개를 우선순위 큐에서 추출 및 제거
            int a = heap.poll();
            int b = heap.poll();
            // 스코빌 지수 계산
            int result = a + (b * 2);
            // 계산이 완료된 값은 다시 우선순위 큐에 삽입
            heap.add(result);
            // 스코빌 지수 계산 횟수 카운팅
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("result : " + solution(new int[]{ 1,2,3,9,10,12 }, 7));
    }
}
