package programmers;

// 124 나라
// https://programmers.co.kr/learn/courses/30/lessons/12899
public class WorldOf124 {
    private static String solution(int n) {
        String[] num = { "4", "1", "2" };
        String answer = "";

        while(n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[result - 1] : " + solution(1)); // 1
        System.out.println("[result - 2] : " + solution(2)); // 2
        System.out.println("[result - 3] : " + solution(3)); // 4
        System.out.println("[result - 4] : " + solution(4)); // 11
        System.out.println("[result - 5] : " + solution(5)); // 12
        System.out.println("[result - 6] : " + solution(6)); // 14
        System.out.println("[result - 7] : " + solution(7)); // 21
        System.out.println("[result - 8] : " + solution(8)); // 22
        System.out.println("[result - 9] : " + solution(9)); // 24
        System.out.println("[result - 10] : " + solution(10)); // 41
    }
}
