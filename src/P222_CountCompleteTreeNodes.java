public class P222_CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return (~0 >>> (32 - height(root))) - count(root, 0);
    }

    public int count(TreeNode node, int i) {
        if (node == null) return i >> 1;
        if (height(node.left) > height(node.right)) return count(node.left, (i << 1) + 1);
        return count(node.right, i << 1);
    }

    public int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + height(node.left);
    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
    }


}
