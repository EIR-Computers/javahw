import java.util.*;
public class Poker {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>(36);
        for (int i = 6; i < 15; i++){
            if(i == 11){
                cards.add("Heart-J");
                cards.add("Diamond-J");
                cards.add("Club-J");
                cards.add("Spade-J");
            } else if ( i == 12) {
                cards.add("Heart-Q");
                cards.add("Diamond-Q");
                cards.add("Club-Q");
                cards.add("Spade-Q");
            }

        }

    }

}
