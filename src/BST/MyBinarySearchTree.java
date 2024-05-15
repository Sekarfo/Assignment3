package BST;

import java.util.Iterator;
import java.util.Stack;

public class MyBinarySearchTree<K extends Comparable<K>, V> {
    private Node root ;
    private int size;
    private class Node
    {

        private K key;
        private V val;
        private Node left , right;
        public Node(K key, V val){
            this.key=key;
            this.val=val;
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


    public Iterable<K> iterator() {
        return new Iterable<K>() {
            @Override
            public Iterator<K> iterator() {
                return new Iterator<K>() {
                    private Node current = root;
                    private Node previous = null;
                    private Stack<Node> stack = new Stack<>();

                    private void pushLeftChildren(Node node) {
                        while (node != null) {
                            stack.push(node);
                            node = node.left;
                        }
                    }

                    {
                        pushLeftChildren(current);
                    }

                    @Override
                    public boolean hasNext() {
                        return !stack.isEmpty();
                    }

                    @Override
                    public K next() {
                        Node nextNode = stack.pop();
                        K key = nextNode.key;
                        pushLeftChildren(nextNode.right);
                        return key;
                    }
                };
            }
        };
    }



}

