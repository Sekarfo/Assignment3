import java.util.Random;

class MyTestingClass {
    private int id;

    public MyTestingClass(int id) {
        this.id = id;
    }

    // Custom hashCode method
    @Override
    public int hashCode() {
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

public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer , String> mht= new MyHashTable<>();
        mht.put(1,"banana");
        mht.put(2,"apple");
        mht.put(3,"orange");
        System.out.println(mht.get(2));






    }
}
