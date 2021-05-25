package testdome;

public class MathUtil {
    public static double average(int a, int b) {
        return (double) (a + b) / 2;
    }
    public static void main(String[] args) {
        System.out.println("[average] : " + average(3, 8));
    }
}
