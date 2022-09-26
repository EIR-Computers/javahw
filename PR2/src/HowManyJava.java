import java.util.Scanner;

public class HowManyJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Please Enter Words");
        String input = sc.nextLine();
        if(input.length() != 0){
            count += 1;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count += 1;
                }
            }
        }

        System.out.println("Words: "+count);
    }
}