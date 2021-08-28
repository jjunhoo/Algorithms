package codility.time_complexity;

// FrogJmp
// https://app.codility.com/c/run/training7E5ESB-VCM/
public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        if (Y <= X) return 0; // 시작 위치가 이미 조건을 만족하는 경우
        if (((Y - X) % D) == 0) return ((Y - X) / D); // 나누어 떨어지는 경우, 몫 그대로 리턴

        return ((Y - X) / D) + 1; // 나누어 떨어지지 않는 경우, 몫 + 1 리턴
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(10, 85, 30)); // 3
    }
}
