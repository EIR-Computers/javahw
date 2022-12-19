import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        Object[] objects = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack<Object> stack = new Stack<>();
        for (Object o : objects) {
            stack.push(o);
        }
        int k = size / 2;
        for (int i = 0; i < k; i++) {
            Object tmp = objects[i];
            objects[i] = stack.pop();
            objects[size - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(objects));
    }
}