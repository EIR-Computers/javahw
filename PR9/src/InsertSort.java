import java.util.Arrays;

public class InsertSort {
    private static void insertSort(Student[] array) {
        int lngth = array.length;
        for (int i = 1; i < lngth; i++) {
            Student key = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j].getIDNumber() > key.getIDNumber())) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int size = 5;
        Student[] students = new Student[size];
        students[0] = new Student("Ingvard", 3);
        students[1] = new Student("Raymond", 5);
        students[2] = new Student("Jurgen", 6);
        students[3] = new Student("Artemius", 1);
        students[4] = new Student("Paul", 4);
        System.out.println(Arrays.toString(students));
        insertSort(students);
        System.out.println(Arrays.toString(students));
    }
}
