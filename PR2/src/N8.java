public class N8 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};
        int lng = 5;
        for (int i = 0; i < lng/2; i++) {
            String bf = array[i];
            array[i] = array[(lng-1-i)];
            array[(lng-1-i)] = bf;

        }
        for (int i = 0; i < lng; i++) {
            System.out.println(array[i]);
        }
    }
}


