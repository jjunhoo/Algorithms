package codility.counting_elements;

import java.util.HashSet;
import java.util.Set;

// MissingInteger
// https://app.codility.com/c/run/trainingTR3BDH-SQW/
public class MissingInteger {
    private static int solution(int[] A) {
        int result = 1;

        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            // 양의 정수만 적재
            if (num > 0) {
                set.add(num);
            }
        }

        // 연속된 값이 다 들어있는 경우, 다음 값을 추출하기 위해 set.size() + 1 까지 loop
        for (int i = 1; i <= set.size() + 1; i++) {
            // 값이 없는 경우 해당 값 result 에 적재
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }
        // 검증 로직에서 걸리지 않는 경우, 1 반환
        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] :: " + solution(new int[]{ 1,3,6,4,1,2 }));
        System.out.println("[result] :: " + solution(new int[]{ -1, -3 }));
        System.out.println("[result] :: " + solution(new int[]{ 1,2,3 }));
    }
}
