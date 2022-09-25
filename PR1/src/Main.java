import java.util.Scanner;
public class Main{
    public static void main (String[] args)
    {
        int sum = 0;
        double middle = 0;
        int[] Array1 = {10, 2, 3, 5, 2, 5, 7, 2, 5, 23};
        for (int i=0; i<=9;i++ ){
            sum = sum + Array1[i];
            middle = sum / 10;
        }
        System.out.println("P1");
        System.out.println("Sum #1: " + sum);
        System.out.println("Middle: " + middle);
        System.out.println("P2");
        System.out.println("Enter 5 numbers");
        int[] arr = new int[10];
        int sum2 = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int c1 = 0;
        Integer intInput = Integer.valueOf(input);
        int min = intInput;
        int max = 0;
        do{
            intInput = Integer.valueOf(input);
            sum2 = sum2 + intInput;
            input = sc.nextLine();
            if(intInput < min){
                min = intInput;
            }
            if(intInput > max){
                max = intInput;
            }
            c1++;

        } while (c1 < 4);
        System.out.println("Sum #2: " + sum2);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("P3");
        if (args.length == 0){
            System.out.println("No args");
        }else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент" + i + ": " + args[i]);
            }
        }
        System.out.println("P4");
        System.out.print("1, ");
        for(int i = 2; i<= 10; i++){
            System.out.print("1/"+ i + ", ");
        }
        System.out.println(9);
        System.out.println("P5");
        System.out.println("Calling factorial for 5");
        System.out.println(factorial(5));


    }
    public static int factorial(int f) {
        int fcr = 1;
        for(int i = 1; i <= f; i++){
            fcr = fcr * i;
        }
        return fcr;
    }
}

