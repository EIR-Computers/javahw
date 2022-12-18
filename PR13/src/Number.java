import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter a phone number");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String red1;
        if (input.charAt(0) == '8') {
            red1 = input.replaceFirst("8", "\\+7");
        } else {
            red1 = input;
        }
        int codeLng = red1.length() - 11;
        String regex = "(\\+\\d{" + codeLng + "})(\\d{3})(\\d{3})(\\d{4})";
        String output = red1.replaceFirst(regex, "$1 $2-$3-$4");
        System.out.println(output);
    }
}
