package HashTable;

class MyTestingClass {
    private int value;

    public MyTestingClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        int hash = (5*31 + value)/5;
        return hash;
    }
}
