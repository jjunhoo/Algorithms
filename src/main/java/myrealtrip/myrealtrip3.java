package myrealtrip;

public class myrealtrip3 {
    public static int solution() {
        for (int a = 1; a <= 1000; a++) {
            for (int b = a+1; b <= 1000; b++) {
                for (int c = b+1; c <= 1000; c++) {
                    if ((a + b + c == 1000) && (c * c == a * a + b * b)) { // 조건
                        // a : 200, b : 375, c : 425
                        System.out.println("[result] : " + (a * b * c));
                        break;
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        solution();
    }
}
