import java.util.ArrayList;

public class TestAtelier {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        TShirt tShirt = new TShirt(Size.M, 65.5, "red");
        clothes.add(tShirt);
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}