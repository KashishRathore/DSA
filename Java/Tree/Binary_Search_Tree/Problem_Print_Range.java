package Tree.Binary_Search_Tree;

public class Problem_Print_Range {
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

    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.println(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else{
            // root.data <= X
            printInRange(root.right, X, Y);
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

        printInRange(root, 6, 10);
    }
}
