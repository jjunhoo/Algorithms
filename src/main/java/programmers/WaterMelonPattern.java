package programmers;

import java.util.stream.IntStream;

/*
[ 수박수박수박수박수박수? ]

[ 문제 설명 ]
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

[ 제한 조건 ]
n은 길이 10,000이하인 자연수입니다.

[ 입출력 예 ]
n	return
3	"수박수"
4	"수박수박"

*/
public class WaterMelonPattern {
    public static String solution(int n) {

        char one = '수';
        char two = '박';
        StringBuilder sb = new StringBuilder();

        IntStream.rangeClosed(1, n).boxed().forEach(currentNumber -> {
            if (currentNumber % 2 == 0) {
                sb.append(two);
            } else {
                sb.append(one);
            }
        });

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + WaterMelonPattern.solution(3));
        System.out.println("[result] : " + WaterMelonPattern.solution(4));
    }
}
