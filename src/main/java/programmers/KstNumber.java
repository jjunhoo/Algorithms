package programmers;

import java.util.*;

// K번째 수
// https://programmers.co.kr/learn/courses/30/lessons/42748
public class KstNumber {
    private static int calculation(int[] array, int[] command) {
        List<Integer> result = new ArrayList<>();

        int start = command[0] - 1; // 시작값
        int end = command[1]; // 종료값

        // 1. command[0] 에서부터 command[1] 까지 자른 후 오름차순 정렬
        for (int i=start; i<end; i++) {
            result.add(array[i]);
        }
        // 리스트 정렬
        Collections.sort(result);

        // 2. command[2] 번째로 큰 숫자
        return result.get(command[2] - 1);
    }
    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();

        for (int[] command : commands) {
            int num = calculation(array, command);
            result.add(num);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + Arrays.toString(solution(new int[]{ 1,5,2,6,3,7,4 }, new int[][]{ { 2,5,3 }, { 4,4,1 }, { 1,7,3 }})));
    }
}
