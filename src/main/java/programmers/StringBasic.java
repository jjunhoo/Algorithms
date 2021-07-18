package programmers;

// 문자열 다루기 기본
// https://programmers.co.kr/learn/courses/30/lessons/12918
public class StringBasic {
    public static boolean solution(String s) {
        // 문자열 길이 체크 (4 또는 6)
        if(s.length() == 4 || s.length() == 6){
            // try/catch 구문 적용
            try{
                // int형 타입으로 convert 하여 성공 시 true 리턴
                int x = Integer.parseInt(s);
                return true;
                // NumberFormatException 발생 시 숫자가 아니므로 false 리턴
            } catch(Exception e){
                return false;
            }
        }
        // 문자열 체크 기준 미충족 시 false 리턴
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("[reuslt] : " + solution("a234")); // false
        System.out.println("[reuslt] : " + solution("1234")); // true
    }
}
