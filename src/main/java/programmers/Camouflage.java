package programmers;

import java.util.HashMap;

// 위장
// https://programmers.co.kr/learn/courses/30/lessons/42578
public class Camouflage {
    private static int solution(String[][] clothes) {
        int result = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String clothesType = clothes[i][1]; // 옷 타입
            clothesMap.put(clothesType, clothesMap.getOrDefault(clothesType, 0) + 1); // 같은 옷 타입인 경우, value 값 +1
        }

        for (String key : clothesMap.keySet()) {
            result *= clothesMap.get(key) + 1; // 옷 타입별 +1 (선택하지 않는 경우의 수 추가)
        }

        return result - 1; // 모든 종류의 옷을 입지 않는 경우의 수 빼기 (최소 1개 이상의 의상은 입기 때문)
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{ { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" }, { "green_turban", "headgear" } }));
        System.out.println(solution(new String[][]{ { "crowmask", "face" }, { "bluesunglasses", "face" }, { "smoky_makeup", "face" } }));
    }
}
