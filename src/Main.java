import java.util.Random;

class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    // Custom hashCode method
    @Override
    public int hashCode() {
        // Custom hash function for better distribution
        return id * 31;
    }

    // Implement equals method for completeness
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
//        Random random = new Random();
//
//
//        for (int i = 0; i < 10000; i++) {
//            MyTestingClass key = new MyTestingClass(random.nextInt(100));
//            table.put(key, "Value " + i);
//        }
//
//
//        for (int i = 0; i < table.getCapacity(); i++) {
//            System.out.println("Bucket " + i + ": " + table.get());
//        }
//    }
//}
