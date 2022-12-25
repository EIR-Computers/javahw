import java.util.Hashtable;

public class Table {
    public static void main(String[] args) {
        Hashtable<Double, Object> hashtable = new Hashtable<>();
        hashtable.put(5.0, "Hello");
        hashtable.put(6.7, "World");
        hashtable.put(8.43, 5);
        System.out.println(hashtable);
    }
}
