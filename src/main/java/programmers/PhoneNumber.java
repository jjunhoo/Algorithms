package programmers;

public class PhoneNumber {
    public static String solution(String phone_number) {
        int num = phone_number.length() - 4;
        String str = phone_number.substring(num);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sb.append("*");
        }
        sb.append(str);

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution("01033334444")); // *******4444
        System.out.println("[result] : " + solution("027778888")); // *****8888
    }
}
