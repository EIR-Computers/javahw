import java.util.Arrays;

public class PR3MathRand {
    public static void main(String[] args) {
        float[] array = new float[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)((Math.random() * 31) - 15);
        }
        System.out.println("---Before sort---");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---After sort---");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
