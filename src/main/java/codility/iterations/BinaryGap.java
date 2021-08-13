package codility.iterations;

// BinaryGap
// https://app.codility.com/c/run/trainingEDY732-76S/
public class BinaryGap {
    public static int solution(int N) {
        int count = 0;
        int result = 0;
        // Integer -> Binary 추출
        String binary = Integer.toBinaryString(N);
        // Binary -> Char[] 변환
        char[] chars = binary.toCharArray();

        for (char ch : chars) {
            if (ch == '0') { // char 가 '0' 인 경우, 카운팅
                count++;
            } else { // char 가 '0' 이 아닌 경우, 현재까지의 count 와 result 중 큰 수를 비교한 후 더 큰 값을 result 에 할당
                result = Math.max(count, result);
                count = 0; // 다음 연속된 '0' 을 카운팅 하기 위해 초기화
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(9));
        System.out.println("[result] : " + solution(529));
        System.out.println("[result] : " + solution(1041));
    }
}
