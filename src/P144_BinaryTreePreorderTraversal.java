import java.util.LinkedList;
import java.util.List;

public class P144_BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<>();
        traverse(root, traversal);
        return traversal;
    }

    public void traverse(TreeNode node, List<Integer> traversal) {
        if (node != null) {
            traversal.add(node.val);
            traverse(node.left, traversal);
            traverse(node.right, traversal);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
