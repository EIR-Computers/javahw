import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("^[a-z]+?@[a-z]+\\.?[a-z]+$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email for check:");
        String string = sc.nextLine();
        sc.close();
        Matcher matcher = ptr.matcher(string);
        if (matcher.matches()) {
            System.out.println("Approved");
        } else {
            System.out.println("Declined");
        }
    }
}