import java.util.Scanner;

public class MainN2 {
    public static int ToN(int input) {
        if(input!=1){
            ToN(input-1);
        }
        System.out.print(input + " ");
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        ToN(integer);
    }

}
