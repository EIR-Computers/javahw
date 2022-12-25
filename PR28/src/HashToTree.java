import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add(3);
        hs.add(2);
        hs.add(1);
        TreeSet<Object> ts = new TreeSet<>(hs);
        System.out.println(ts);
    }
}
