package HashTable;

class Test_Val {
    private int value;

    public Test_Val(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test_Val student = (Test_Val) o;
        return value == student.value;
    }


}
