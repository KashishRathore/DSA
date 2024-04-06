package Tree.Binary_Search_Tree;

import java.util.ArrayList;

public class Problem_Root_To_Leaf {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int key) {
            this.data = key;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key) {
            // left subtree
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } 
        // non-leaf
        else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int keys[] = { 8, 5, 3, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < keys.length; i++) {
            root = insert(root, keys[i]);
        }

        inorder(root);
        System.out.println();

        printRootToLeaf(root, new ArrayList<>());
    }
}
