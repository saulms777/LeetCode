import java.util.LinkedList;
import java.util.List;

public class P94_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new LinkedList<>();
        traverse(root, traversal);
        return traversal;
    }

    public void traverse(TreeNode node, List<Integer> traversal) {
        if (node != null) {
            traverse(node.left, traversal);
            traversal.add(node.val);
            traverse(node.right, traversal);
        }
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> traversal = new LinkedList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = root;
//        while (current != null || !stack.isEmpty()) {
//            while (current != null) {
//                stack.push(current);
//                current = current.left;
//            }
//            TreeNode top = stack.pop();
//            traversal.add(top.val);
//            current = top.right;
//        }
//        return traversal;
//    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
