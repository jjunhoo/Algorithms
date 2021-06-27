package programmers;

import java.util.stream.IntStream;

/*
[ 소수 찾기 ]

[ 문제 설명 ]
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

[ 제한 조건 ]
n은 2이상 1000000이하의 자연수입니다.

[ 입출력 예 ]
n	result
10	4
5	3

입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

*/
public class PrimeNumberSearch {
    public static int solution(int number) {
        long result = IntStream.rangeClosed(2, number).filter(value -> {
            // 소수 여부
            boolean isPrime = true;

            // 1과 자신을 제외한 수를 반복
            for (int i=2; i<value; i++) {
                // 자기 자신이 아닌 반복되는 수로 나누어 떨어지면 소수가 아님
                if (value % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }).count();

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + PrimeNumberSearch.solution(10)); // 4개
        System.out.println("[result] : " + PrimeNumberSearch.solution(5)); // 3개
    }
}
