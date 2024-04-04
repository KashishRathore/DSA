package Binary_Tree;

public class Subtree_Of_Another_Tree {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int data){
            this.data = data;
        }
        TreeNode(int data, TreeNode left, TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
           return true;
        }

        if(root == null || subRoot == null){
            return false;
        }

        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot) && isIdentical(root.right, subRoot);
        }

        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(subRoot == null){
           return true;
        }

        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
           if(isIdentical(root, subRoot)){
            return true;
           }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        
    }
}
