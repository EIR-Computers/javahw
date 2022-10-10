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
            else if ( i == 13) {
                cards.add("Heart-K");
                cards.add("Diamond-K");
                cards.add("Club-K");
                cards.add("Spade-K");
            }
            else if ( i == 14) {
                cards.add("Heart-A");
                cards.add("Diamond-A");
                cards.add("Club-A");
                cards.add("Spade-A");
            }else{
                cards.add("Heart-" + i);
                cards.add("Diamond-" + i);
                cards.add("Club-" + i);
                cards.add("Spade-" + i);
            }

        }
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Integer intInput = Integer.valueOf(input);
        if (intInput > 7){
            System.out.println("Too much players");
        }else {
            int iter = 0;
            for (int i = 1; i <= intInput; i++) {
                System.out.println("----------Player " + i + " cards----------");
                for(int j = 0; j < 5; j++){
                    Random rand = new Random();
                    int x = rand.nextInt(35 - iter);
                    System.out.println(cards.get(x));
                    cards.remove(x);
                    iter += 1;
                }


            }
        }

    }

}
