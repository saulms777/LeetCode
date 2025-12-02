import java.util.LinkedList;
import java.util.List;

public class P145_BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<>();
        traverse(root, traversal);
        return traversal;
    }

    public void traverse(TreeNode node, List<Integer> traversal) {
        if (node != null) {
            traverse(node.left, traversal);
            traverse(node.right, traversal);
            traversal.add(node.val);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
