package HashTable;

class Test_Key {
    private int value;

    public Test_Key(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test_Key that = (Test_Key) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        int hash = (5*31 + value)/5;
        return hash;
    }
}
