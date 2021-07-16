package programmers;

/*
[ 가운데 글자 가져오기 ]

[ 문제 설명 ]
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

[ 재한사항 ]
s는 길이가 1 이상, 100이하인 스트링입니다.

[ 입출력 예 ]
s	return
"abcde"	"c"
"qwer"	"we"
 */
// 가운데 글자 가져오
// https://programmers.co.kr/learn/courses/30/lessons/12903
public class MiddleCharacter {

    public static String solution(String word) {
        String result = "";

        // 문자열 길이 체크 (1 ~ 100)
        if (!(word.length() >= 1 && word.length() <= 100)) {
            return result;
        }

        // 문자열 길이가 홀수인 경우, 가운데 1글자 return
        if (word.length() % 2 == 1) {
            result = word.substring(word.length() / 2, word.length() / 2 + 1);
        } else {
            result = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MiddleCharacter.solution("abcde"));
        System.out.println(MiddleCharacter.solution("qwer"));
    }
}
