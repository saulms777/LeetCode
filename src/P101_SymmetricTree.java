public class P101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }

    public boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        return left.val == right.val &&
                symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
