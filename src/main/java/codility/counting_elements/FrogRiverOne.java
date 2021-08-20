package codility.counting_elements;

import java.util.HashSet;
import java.util.Set;

// FrogRiverOne
// https://app.codility.com/c/run/trainingZ6G8XJ-YGT/
// https://tram-devlog.tistory.com/entry/Codility-42-FrogRiverOne
public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            // 배열의 값이 주어진 X 보다 작은 경우에만 추가 (중간에 더 큰값이 있는 경우, -1 리턴)
            if (A[i] <= X) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(5, new int[]{ 1,3,1,4,2,3,5,4 } )); // 6
    }
}
