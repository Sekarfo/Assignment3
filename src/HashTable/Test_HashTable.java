package HashTable;

import java.util.Random;


public class Test_HashTable {
    public static void main(String[] args) {
        MyHashTable<Test_Key, Test_Val> table = new MyHashTable<>(25);
        Random random = new Random();



        for (int i = 0; i < 10000; i++) {
            int value = random.nextInt(10000);
            Test_Key key = new Test_Key(value);
            table.put(key, new Test_Val(value));
        }
        for (int i = 0; i < table.getCapacity(); i++) {
            System.out.println("Bucket " + i + " has " + table.getSize() + " elements.");
        }





    }
}
