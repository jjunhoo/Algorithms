package programmers;

// 숫자 문자열과 영단어
// https://programmers.co.kr/learn/courses/30/lessons/81301
public class NumberStringAndAlphabet {
    private static int solution(String str) {
        String[] splitstr = str.split("\\d+"); // 문자 추출
        StringBuilder sb = new StringBuilder();

        // 모든 문자가 숫자인 경우, 그대로 return
        if (splitstr.length == 0) {
            return Integer.parseInt(str);
        }

        for (int i=0; i<str.length(); i++) {
            // 숫자인 경우 그대로 insert
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sb.append(str.charAt(i));
            }

            // 문자인 경우 convert
            if (str.charAt(i) == 'z') { // zero
                sb.append('0');
                i += 3;
            } else if (str.charAt(i) == 'o') { // one
                sb.append('1');
                i += 2;
            } else if (str.charAt(i) == 't') { // two, three
                if ("two".equals(str.substring(i, i+3))) {
                    sb.append('2');
                    i += 2;
                } else {
                    sb.append('3');
                    i += 4;
                }
            } else if (str.charAt(i) == 'f') { // four, five
                if ("four".equals(str.substring(i, i+4))) {
                    sb.append('4');
                } else {
                    sb.append('5');
                }
                i += 3;
            } else if (str.charAt(i) == 's') { // six, seven
                if ("six".equals(str.substring(i, i+3))) {
                    sb.append('6');
                    i += 2;
                } else {
                    sb.append('7');
                    i += 4;
                }
            } else if (str.charAt(i) == 'e') { // eight
                sb.append('8');
                i += 4;
            } else if (str.charAt(i) == 'n') { // nine
                sb.append('9');
                i += 3;
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution("one4seveneight")); // 1478
        System.out.println("[result] : " + solution("23four5six7")); // 234567
        System.out.println("[result] : " + solution("2three45sixseven")); // 234567
        System.out.println("[result] : " + solution("123")); // 123
    }
}
