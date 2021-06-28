package programmers;

/*
[ 문자열 다루기 기본 ]

[ 문제 설명 ]
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

[ 제한 사항 ]
s는 길이 1 이상, 길이 8 이하인 문자열입니다.

[ 입출력 예 ]
s	    return
"a234"	false
"1234"	true

*/
public class StringHandlingBasics {
    public static boolean solution(String str) {
        // 문자열 길이 Valid
        if (!(str.length() == 4 || str.length() == 6)) {
            return Boolean.FALSE;
        }

        try {
            // 문자열 -> Integer
            int convertNum = Integer.parseInt(str);
            return Boolean.TRUE;
        } catch (NumberFormatException e) { // Parse 시 NumberFormatException 발생 시 숫자가 아니므로 return - false
            return Boolean.FALSE;
        }
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + StringHandlingBasics.solution("a234"));
        System.out.println("[result] : " + StringHandlingBasics.solution("1234"));
    }
}
