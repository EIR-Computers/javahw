import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void checker(String num) throws IncorrectNumberException {
        Pattern ptr = Pattern.compile("^\\d{12}$");
        Matcher mtr = ptr.matcher(num);
        if (!mtr.matches()) {
            throw new IncorrectNumberException("Exception: There should be 12 numbers");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String input = sc.nextLine();
        sc.close();
        try {
            checker(input);
            System.out.println("Correct");
        } catch (IncorrectNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}

