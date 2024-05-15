package HashTable;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(25);
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int value = random.nextInt(10000);
            MyTestingClass key = new MyTestingClass(value);
            table.put(key, new Student(value));
        }
        for (int i = 0; i < table.getCapacity(); i++) {
            System.out.println("Bucket " + i + " has " + table.getSize() + " elements.");
        }





    }
}
