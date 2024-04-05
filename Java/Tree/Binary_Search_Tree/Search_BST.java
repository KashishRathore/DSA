package Tree.Binary_Search_Tree;

public class Search_BST {
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            // not exist
            return false;
        }
        if (root.data > key) {
            // Left subtree
            return search(root.left, key);
        }

        else if (root.data == key) {
            // matched
            return true;
        }
        else {
            // Right subtree
            // root.data < key
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

        int keys[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < keys.length; i++) {
            root = insert(root, keys[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root, 5)){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
