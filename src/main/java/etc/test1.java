package etc;

import java.util.HashMap;

/**
 * 짝이 맞지 않는 숫자 찾기
 * 예 : 1,3,2,2,5,5,1 에서 '3' 은 짝이 없기 때문에 result '3'
 */
public class test1 {
    private static int solution(int[] cards) {
        HashMap<Integer, Integer> pairCards = new HashMap<>();

        for (int card : cards) {
            pairCards.put(card, pairCards.getOrDefault(card, 0) + 1);
        }

        for (Integer key : pairCards.keySet()) {
            if (pairCards.get(key) == 1) return key;
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 1,3,2,2,5,5,1 })); // 3
    }
}
