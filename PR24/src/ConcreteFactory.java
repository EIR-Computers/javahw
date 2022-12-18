public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex makeComplex() {
        return new Complex();
    }

    @Override
    public Complex makeComplex(int real, int img) {
        return new Complex(real, img);
    }
}
