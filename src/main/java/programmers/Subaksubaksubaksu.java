package programmers;

// 수박수박수박수박수박수?
// https://programmers.co.kr/learn/courses/30/lessons/12922
public class Subaksubaksubaksu {
    private static String watermelon(int n){
        char odd = '수';
        char even = '박';
        StringBuilder sb = new StringBuilder();
        boolean bool = false;

        for(int i = 0; i < n; i++){
            if (Boolean.TRUE.equals(bool)){
                sb.append(even);
                bool = false;
            } else {
                sb.append(odd);
                bool = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("[result] : " + watermelon(3));
        System.out.println("[result] : " + watermelon(4));
    }
}
