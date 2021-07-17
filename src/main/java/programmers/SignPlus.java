package programmers;

// 음양 더하기
// https://programmers.co.kr/learn/courses/30/lessons/76501
public class SignPlus {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (Boolean.TRUE.equals(signs[i])) { // + 부호인 경우
                answer += absolutes[i];
            } else { // - 부호인 경우
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + solution(new int[]{ 4,7,12 }, new boolean[]{ true,false,true }));
        System.out.println("[result] : " + solution(new int[]{ 1,2,3 }, new boolean[]{ false,false,true }));
    }
}
