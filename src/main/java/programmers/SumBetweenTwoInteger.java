package programmers;

import java.util.stream.IntStream;

/*
[ 두 정수 사이의 합 ]

[ 문제 설명 ]
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

[ 제한 조건 ]
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.

[ 입출력 예 ]
a	b	return
3	5	12
3	3	3
5	3	12

*/
public class SumBetweenTwoInteger {
    public static int solution(int a, int b) {
        // 두 수가 같은 경우 아무 숫자나 return
        if (a == b) { return a; }

        int max, min = 0;

        if (a > b) { // 두 수를 비교하여 a 가 더 클 경우, a 를 max 변수에 저장
            max = a;
            min = b;
        } else { // 두 수를 비교하여 b 가 더 클 경우, b 를 max 변수에 저장
            max = b;
            min = a;
        }

        return IntStream.rangeClosed(min, max).sum(); // min ~ max 까지의 숫자 합 return
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + SumBetweenTwoInteger.solution(3, 5));
        System.out.println("[result] : " + SumBetweenTwoInteger.solution(3, 3));
        System.out.println("[result] : " + SumBetweenTwoInteger.solution(5, 3));
    }
}
