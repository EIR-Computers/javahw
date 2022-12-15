import java.util.Scanner;

public class MainN1
{
    public static int Triangle(int input) {

        for(int i = 1; i<= input; i++){
            System.out.print(input + " ");
        }
        if(input==0){
            return 0;
        }
        else {

            return Triangle(input - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        Triangle(integer);
    }
}
