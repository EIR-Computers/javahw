

public class Main {
    public static void main(String[] args) {
        hashTable ht = new hashTable();
        Integer[] keys = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] values = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        ht.HashTableInit(keys, values);
        for(int i = 0; i<10; i++){
            System.out.println(i + " " +ht.HashTabLookUp(i));
        }
        System.out.println(ht.HashTabLookUp(0));
        ht.HashTabRemove(0);
        System.out.println(ht.HashTabLookUp(0));

    }
}