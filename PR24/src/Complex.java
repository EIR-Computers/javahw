public class Complex {
    private int real, img;

    public Complex() {
    }

    public Complex(int a, int b) {
        this.real = a;
        this.img = b;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return real + " + j" + img;
    }
}