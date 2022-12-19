import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C://tm/f.txt");
        Scanner sc = new Scanner(f);
        String str = sc.nextLine();
        sc.close();
        Pattern pUSD = Pattern.compile("\\d+\\.\\d{1,2}\\s+USD");
        Pattern pRUB = Pattern.compile("\\d+\\.\\d{1,2}\\s+RUB");
        Pattern pEUR = Pattern.compile("\\d+\\.\\d{1,2}\\s+EUR");
        Matcher mUSD = pUSD.matcher(str);
        Matcher mRUB = pRUB.matcher(str);
        Matcher mEUR = pEUR.matcher(str);
        System.out.println("USD:");
        while (mUSD.find()) {
            System.out.println(str.substring(mUSD.start(), mUSD.end()));
        }
        System.out.println();
        System.out.println("RUR:");
        while (mRUB.find()){
            System.out.println(str.substring(mRUB.start(), mRUB.end()));
        }
        System.out.println();
        System.out.println("EUR:");
        while (mEUR.find()){
            System.out.println(str.substring(mEUR.start(), mEUR.end()));
        }
    }
}