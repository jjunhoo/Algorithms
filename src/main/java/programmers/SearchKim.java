package programmers;

/*
[ 서울에서 김서방 찾기 ]

[ 문제 설명 ]
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

[ 제한 사항 ]
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
"Kim"은 반드시 seoul 안에 포함되어 있습니다.

[ 입출력 예 ]
seoul	        return
["Jane", "Kim"]	"김서방은 1에 있다"

*/
public class SearchKim {
    private static final String KIM = "Kim";

    public static String solution(String[] str) {
        // 배열 길이 valid
        if (str.length < 1 || str.length > 1000) {
            return "";
        }

        for (int i=0; i<str.length; i++) {
            // 원소 길이 valid
            if (str[i].length() < 1 || str[i].length() > 20) {
                return "";
            }
            if (KIM.equals(str[i])) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return "";
    }
    public static void main(String[] args) {
        String[] seoul = new String[]{ "Queen", "Tod", "Kim" };
        System.out.println(SearchKim.solution(seoul));
    }
}
