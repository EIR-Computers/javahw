import java.util.ArrayList;

public class Atelier {
    public void dressMan(ArrayList<Clothes> clothes) {
        for (Clothes element : clothes) {
            if (element instanceof MenClothing) {
                ((MenClothing) element).dressMan();
            }
        }
    }

    public void dressWoman(ArrayList<Clothes> clothes) {
        for (Clothes element : clothes) {
            if (element instanceof WomenClothing) {
                ((WomenClothing) element).dressWoman();
            }
        }
    }
}


