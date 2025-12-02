import java.util.LinkedList;
import java.util.List;

public class P257_BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> p = new LinkedList<>();
        if (root.left == null && root.right == null) {
            p.add(String.valueOf(root.val));
            return p;
        }
        if (root.left != null) {
            for (String s : binaryTreePaths(root.left)) {
                p.add(root.val + "->" + s);
            }
        }
        if (root.right != null) {
            for (String s : binaryTreePaths(root.right)) {
                p.add(root.val + "->" + s);
            }
        }
        return p;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
