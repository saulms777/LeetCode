public class P226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
