package codility.prime_and_composite_numbers;

public class MinPerimeterRectangle {
    public static int solution(int N) {
        int first = 1;
        // input parameter의 제곱근 값 (예: N = 36, sqrt = 6)
        double sqrt = Math.sqrt(N);

        // N의 제곱근값까지 LOOP
        for(int i=1; i<=sqrt; i++) {
            // 가장 큰 값 추출
            if(N % i == 0) {
                first = i;
            }
        }

        // N의 제곱근값의 약수중 가장 큰값으로 N값을 나눈 몫
        int last = N / first;

        // first(A) + last(B) * 2 리턴
        return (first + last) * 2;
    }
    public static void main(String[] args) {
        System.out.println(solution(30));
    }
}
