public class StartMath {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 4);
        MathCalculable mf = new MathFn();
        System.out.println(mf.abs(c1));
        double radius = 4;
        double circumference = 2 * MathFn.PI * radius;
        System.out.println(circumference);
    }
}