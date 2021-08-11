package programmers;

// 부족한 금액
// https://programmers.co.kr/learn/courses/30/lessons/82612
public class InsufficientPrice {
    private static long soulution(int price, int money, int count) {
        long answer = 0;

        if (price < 1 || price > 2500) {
            return 0;
        }

        if (money < 1 || money > 1000000000) {
            return 0;
        }

        if (count < 1 || count > 2500) {
            return 0;
        }

        // 횟수가 1번으로, 금액이 부족하지 않은 경우, 0 리턴
        if (count == 1 && (money >= price)) {
            return 0;
        }

        // 총 비용 계산
        for (int i=1; i<=count; i++) {
            answer += (price * i); // count 번 타게 되면, 원래 이용료의 N배 만큼 증액
        }

        // 금액이 부족하지 않은 경우,
        if (answer - money <= 0) {
            return 0;
        }

        // 부족한 금액 계산
        return answer - money;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + soulution(3, 20, 4)); // 10
    }
}
