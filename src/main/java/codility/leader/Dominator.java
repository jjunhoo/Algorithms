package codility.leader;

import java.util.HashMap;

// Dominator
// https://app.codility.com/c/run/trainingMR5V9S-JCU/
// 특정 숫자가 배열 길이의 과반수 이상을 차지하는지 확인 (Dominator 가 있는 경우, 해당 숫자의 인덱스 아무거나 리턴)
public class Dominator {
    public static int solution(int[] A) {
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
            return 0;
        }
        // 카운팅된 횟수가 배열 길이의 반 이상이 되지 않는다면 Dominator 가 아님
        if (count <= (A.length / 2)) {
            return -1;
        }

        // Dominator 발견 시 해당 배열 element index 리턴
        for (int i = 0; i < A.length; i++) {
            if (dominator == A[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 3,4,3,2,3,-1,3,3 }));
    }
}
