package BST;

import java.util.Iterator;

public class Test_BST {
    public static void main(String[] args) {
        MyBinarySearchTree<String, Integer> bst=new MyBinarySearchTree<>();
        bst.put("first", 1);
        bst.put("third", 3);
        bst.put("fifth", 5);
        bst.put("second",2);

        System.out.println(bst.get("second"));
        System.out.println("In-order traversal:");
        Iterator<MyBinarySearchTree<String, Integer>.Node> iterator = bst.iterator();
        while (iterator.hasNext()) {
            MyBinarySearchTree<String, Integer>.Node node = iterator.next();
            System.out.println("Key is " + node.getKey() + " and value is " + node.getValue());
        }





    }
}
