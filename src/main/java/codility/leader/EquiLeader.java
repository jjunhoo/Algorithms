package codility.leader;

import java.util.HashMap;

// TODO
// EquiLeader
// https://app.codility.com/c/run/trainingXWCZDK-G3Y/
// 1. 배열의 리더값 추출
// 2. 배열을 이등분하여, 각각의 배열 그룹의 리더가 1번에서 구한 리더값과 같은지 카운팅
// 참고 : https://hwan-shell.tistory.com/112
public class EquiLeader {
    private static int getDominator(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int dominator = 0;
        int count = 0;

        for (int num : A) {
            // 이미 있는 숫자라면, 해당 숫자의 value 값 + 1
            if (hm.containsKey(num)) {
                int temp = hm.get(num) + 1;
                hm.put(num, temp);

                // 해당 숫자 개수 개별 카운팅
                if (temp > count) {
                    count = temp;
                    dominator = num;
                }
            } else {
                // 최초 숫자인 경우, 삽입
                hm.put(num, 1);
            }
        }

        // 배열 내 Element 가 1개인 경우, 0번 index 리턴
        if (A.length == 1) {
            return A[0];
        }

        // 카운팅된 횟수가 배열 길이의 반 이상이 되지 않는다면 Dominator 가 아님
        if (count <= (A.length / 2)) {
            return -1;
        }

        return dominator;
    }

    private static int solution(int[] A) {
        int result = 0;
        int[] groupA = new int[A.length / 2];
        int[] groupB = new int[A.length / 2];

        for (int i = 0; i < A.length / 2; i++) {
            groupA[i] = A[i];
            groupB[i] = A[i + A.length / 2];
        }

        int dominator = getDominator(A);
        int dominatorA = getDominator(groupA);
        int dominatorB = getDominator(groupB);

        if (dominator == dominatorA) {
            result++;
        }
        if (dominator == dominatorB) {
            result++;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 4,3,4,4,4,2 })); // 2
    }
}
