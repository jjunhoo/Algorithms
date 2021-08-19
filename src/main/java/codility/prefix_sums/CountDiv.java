package codility.prefix_sums;

// CountDiv
// https://a1010100z.tistory.com/56
public class CountDiv {
    // A ~ B 까지의 숫자중에서 K 로 나눌 수 있는 숫자의 개수
    public static int solution(int A, int B, int K) {
        // A가 K로 나누어 떨어지면, B까지의 나누어 떨어지는 정수의 수 - A까지의 나누어 떨어지는 정수의 수 + 1
        if (A % K == 0) {
            return B/K - A/K + 1;
        }

        return B/K - A/K;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(6, 11, 2)); // 3
    }
}
