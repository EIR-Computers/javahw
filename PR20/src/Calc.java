public class Calc {
    public static <T extends Number> double sum(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double sub(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }

    public static <T extends Number> double mul(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double div(T x, T y) {
        if (y.doubleValue() == 0.0) {
            throw new ArithmeticException("Division By Zero");
        }
        return x.doubleValue() / y.doubleValue();
    }
}
