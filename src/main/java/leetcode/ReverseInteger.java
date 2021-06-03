package leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        try {
            if(x == 0) return 0;

            String str = String.valueOf(x);
            Boolean minus = Boolean.FALSE;

            if (str.contains("-")) {
                str = str.substring(1);
                minus = Boolean.TRUE;
            }

            // 문자열 reverse
            StringBuilder sb = new StringBuilder(str);
            String resultstr = sb.reverse().toString();

            return minus ? Integer.parseInt("-" + resultstr) : Integer.parseInt(resultstr);

        } catch (NumberFormatException e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(123));
        System.out.println(ReverseInteger.reverse(-123));
        System.out.println(ReverseInteger.reverse(120));
        System.out.println(ReverseInteger.reverse(0));
        System.out.println(ReverseInteger.reverse(153423646));
    }
}
