package Binary_Tree;

// Number of Nodes in the longest path between 2 nodes

public class Diameter_Of_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTreeNode(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTreeNode(nodes);
            newNode.right = buildTreeNode(nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight , rightHeight) + 1;

        return myHeight;
    }

    // Approach 1 : O(n^2)
    public static int diameter(Node root){
        if( root == null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(dia3, Math.min(dia1, dia2));
  
    }
    public static void main(String[] args) {
        
    }
}
