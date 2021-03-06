package programmers;
/*
[ 2016년 ]

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

[ 제한 조건 ]
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

[ 입출력 예 ]
a	b	result
5	24	"TUE"
 */
// 2016년
// https://programmers.co.kr/learn/courses/30/lessons/12901
public class Year2016 {
    public static String getDayName(int a, int b) {
        String result = "";
        // 2016년 1월 1일은 금요일이기 때문에 아래와 같이 요일 배열 선언
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;

        for (int i = 0; i < a - 1; i++) {
            // 1월부터 입력 받은 월까지 해당 월의 마지막 일을 더함
            allDate += date[i];
        }

        // 입력 받은 b(일) 의 -1 한 값을 allDate 에 더함
        allDate += (b - 1);

        result = day[allDate % 7];

        return result;
    }

    public static void main(String[] args) {
        System.out.println("[getDayName] : " + getDayName(5, 24));
    }
}
