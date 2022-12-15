import java.util.Scanner;

public class MainN3 {
    public static int AB(int inputA, int inputB) {
        if(inputA < inputB){
            AB(inputA, inputB - 1);
            System.out.print(inputB + " ");
        } else if (inputA > inputB) {
            AB(inputA, inputB + 1);
            System.out.print(inputB + " ");

        }else {
            System.out.print(inputA + " ");
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerA = scanner.nextInt();
        int integerB = scanner.nextInt();
        AB(integerA, integerB);
    }
}
