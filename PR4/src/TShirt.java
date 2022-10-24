public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.println("T-shirt is compatable with man");
    }

    @Override
    public void dressWoman() {
        System.out.println("T-shirt is compatable with woman");
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + super.getSize() +
                ", price=" + super.getPrice() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
