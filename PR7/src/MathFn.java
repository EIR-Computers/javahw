class MathFn implements MathCalculable {

    @Override
    public double pow(double x, double n) {
        return Math.pow(x, n);
    }

    @Override
    public double abs(Complex complex) {
        return Math.sqrt(pow(complex.getX(), 2) + pow(complex.getY(), 2));
    }
}
