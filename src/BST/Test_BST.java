package BST;

public class Test_BST {
    public static void main(String[] args) {
        MyBinarySearchTree<String, Integer> bst=new MyBinarySearchTree<>();
        bst.put("first", 1);
        bst.put("third", 3);
        bst.put("fifth", 5);
        bst.put("second",2);

        System.out.println(bst.get("second"));


    }
}
