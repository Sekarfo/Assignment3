package BST;

import java.util.Iterator;
import java.util.Stack;

public class MyBinarySearchTree<K extends Comparable<K>, V> implements Iterable<MyBinarySearchTree<K, V>.Node> {
    private Node root ;
    private int size;
    public class Node
    {

        private K key;
        private V val;
        private Node left , right;
        public Node(K key, V val){
            this.key=key;
            this.val=val;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return val;
        }
    }
    public MyBinarySearchTree() {
        root = null;
        size = 0;
    }

    public void put(K key, V val){
        root=put(root, key, val);
        size++;
    }

    private Node put(Node node, K key, V val) {
        if (node == null) return new Node(key, val);
        int cmp = key.compareTo(node.key);

        if (cmp < 0) node.left = put(node.left, key, val);
        if (cmp > 0) node.right = put(node.right, key, val);
        else node.val=val;
        return node;
    }

    public V get(K key){
        return get(root, key);
    }

    private V get(Node node, K key){
        if(node==null) return null;
        int cmp =key.compareTo(node.key);

        if(cmp<0) return get(node.left, key);
        if(cmp>0) return get(node.right, key);
        else return node.val;
    }
    public void delete(K key){
        root=delete(root, key);
        size--;
    }
    private Node delete(Node node, K key){
        int cmp= key.compareTo(node.key);
        if(node==null) return null;
        if(cmp<0) node.left=delete(node.left, key);
        else if(cmp>0) node.right=delete(node.right, key);
        else{
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            node.key = minValue(node.right);
            node.right = delete(node.right, node.key);
        }
        return node;

    }

    private K minValue(Node node){
        while(node.left!= null) node=node.left;
        return node.key;
    }


    @Override
    public Iterator<Node> iterator() {
        return new MyIterator(root);
    }

    private class MyIterator implements Iterator<Node> {
        private Stack<Node> stack = new Stack<>();
        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }
        @Override
        public Node next() {
            Node node = stack.pop();
            pushLeft(node.right);
            return node;
        }

        private void pushLeft(Node node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public MyIterator(Node root) {
            pushLeft(root);
        }


        };
    }



