package codility.array;

import java.util.HashMap;

// OddOccurrenceInArray
//
public class OddOccurrenceInArray {
    public static int solution(int[] A) {
        int result = 0;
        HashMap<Integer, Integer> hash = new HashMap();

        for (int element : A) {
            if (hash.get(element) == null) { // hash 에 없는 경우, 삽입
                hash.put(element, element);
            } else { // hash 에 있는 경우, 삭제
                int res = hash.get(element);
                hash.remove(res);
            }
        }

        for (Integer key : hash.keySet()) {
            result = key;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 9,3,9,3,9,7,9 }));
    }
}
