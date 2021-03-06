package testdome;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double common = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b + common) / (2 * a);
        double root2 = (-b - common) / (2 * a);
        return new Roots(root1, root2);
    }
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("[Roots] : " + roots.getX1() + ", " + roots.getX2());
    }
}
class Roots {
    private final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
