import java.util.Arrays;

public class Merging {
        public static void main(String[] args) {
            int size1 = 3, size2 = 5;
            Student[] array1 = new Student[size1], array2 = new Student[size2];
            initializeArraysOfStudents(array1, array2);
            Student[] result = new Student[size1 + size2];
            System.arraycopy(array1, 0, result, 0, size1);
            System.arraycopy(array2, 0, result, size1, size2);
            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(result));
        }

        private static void initializeArraysOfStudents(Student[] s1, Student[] s2) {
            Student st1 = new Student("Ivan", 13);
            Student st2 = new Student("Alexander", 45);
            Student st3 = new Student("Andrew", 92);
            Student st4 = new Student("Maxim", 50);
            Student st5 = new Student("Evgeny", 49);
            Student st6 = new Student("Newt", 34);
            Student st7 = new Student("Vasily", 69);
            Student st8 = new Student("Igor", 78);
            s1[0] = st1;
            s1[1] = st2;
            s1[2] = st3;
            s2[0] = st4;
            s2[1] = st5;
            s2[2] = st6;
            s2[3] = st7;
            s2[4] = st8;
        }

}
