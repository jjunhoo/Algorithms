package programmers;

import java.util.*;

// 이중우선순위큐
// https://programmers.co.kr/learn/courses/30/lessons/42628
public class DoublePriorityQueue {
    private static final int MAX_VALUE_DELETE = 1;
    private static final int MIN_VALUE_DELETE = -1;

    private static void caculate(String[] element, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        String operation = element[0];
        int value = Integer.parseInt(element[1]);

        switch (operation) {
            // 큐에 숫자 삽입 (INSERT) -> 최대힙 / 최소힙 모두에 삽입
            case "I" :
                minHeap.add(value);
                maxHeap.add(value);
                break;
            // 큐에 숫자 삭제 (DELETE)
            case "D" :
                /**
                 * 1 인 경우, 큐에서 최대값 삭제
                 * -1 인 경우, 큐에서 최소값 삭제
                 */
                if (minHeap.isEmpty() && maxHeap.isEmpty()) {
                    break;
                }
                if (MAX_VALUE_DELETE == value) {
                    // 최대힙에서 최대값 삭제
                    int max = maxHeap.poll();
                    // 최소힙에서 해당 값 삭제
                    minHeap.remove(max);
                    System.out.println("[init]");
                } else if (MIN_VALUE_DELETE == value) {
                    // 최소힙에서 최소값 삭제
                    int min = minHeap.poll();
                    // 최대힙에서 해당 값 삭제
                    maxHeap.remove(min);
                }
                break;
            default :
                break;
        }
    }
    private static int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue(); // 최소힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder()); // 최대힙
        int[] result = new int[2];

        for (String oper : operations) {
            String[] element = oper.split(" "); // 배열 element 를 공백 기준으로 분리
            caculate(element, minHeap, maxHeap);
        }

        // 최대값, 최소값
        if (maxHeap.size() > 0 && minHeap.size() > 0) {
            result[0] = maxHeap.peek();
            result[1] = minHeap.peek();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(solution(new String[]{ "I 16","D 1" })));
        System.out.println("[result] : " + Arrays.toString(solution(new String[]{ "I 11","I 13","D 1" })));
        System.out.println("[result] : " + Arrays.toString(solution(new String[]{ "I 7","I 5","I -5","D -1" })));
    }
}
