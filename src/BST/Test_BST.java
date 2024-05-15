package BST;

import java.util.Iterator;

public class Test_BST {
    public static void main(String[] args) {
        MyBinarySearchTree<String, Integer> myBinarySearchTree =new MyBinarySearchTree<>();
        myBinarySearchTree.put("first", 1);
        myBinarySearchTree.put("third", 3);
        myBinarySearchTree.put("fifth", 5);
        myBinarySearchTree.put("second",2);

        System.out.println(myBinarySearchTree.get("second"));



        Iterator<MyBinarySearchTree<String, Integer>.Node> nodeIterator = myBinarySearchTree.iterator();
        while (nodeIterator.hasNext()) {
            MyBinarySearchTree<String, Integer>.Node node = nodeIterator.next();
            System.out.println("Key:" + node.getKey() + "   value:" + node.getValue());
        }





    }
}
