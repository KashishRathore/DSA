package Tree.Binary_Search_Tree;

public class Delete_BST {
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

    public static Node delete(Node root, int key){
        if(root.data > key){
             root.left = delete(root.left, key);
        }
        else if(root.data < key){
             root.right = delete(root.right, key);
        }
        else{  //root.data == val
            //case 1 -> Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 
            if(root.left == null ){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        
        return root;
    }

    public static Node inorderSuccessor(Node root){
            while (root.left != null) {
               root = root.left;
            }

            return root;
    }

    public static void main(String[] args) {
        
        int keys[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < keys.length; i++) {
            root = insert(root, keys[i]);
        }

        inorder(root);
        System.out.println();

        delete(root, 10);

        inorder(root);



    }
}
