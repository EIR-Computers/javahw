import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Y M D:");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Enter H M S:");
        int h = sc.nextInt();
        int min = sc.nextInt();
        int s = sc.nextInt();
        sc.close();
        Calendar calendar = new GregorianCalendar(y, m - 1, d);
        calendar.set(Calendar.HOUR, h);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, s);
        Date date = calendar.getTime();
        System.out.println("Calendar: " + calendar);
        System.out.println("Date: " + date);
    }
}