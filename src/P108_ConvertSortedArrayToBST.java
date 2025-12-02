public class P108_ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0], null, null);

        int leftLen = nums.length / 2;
        int rightLen = (nums.length - 1) / 2;
        int[] nums1 = new int[leftLen];
        System.arraycopy(nums, 0, nums1, 0, leftLen);
        int[] nums2 = new int[rightLen];
        System.arraycopy(nums, leftLen + 1, nums2, 0, rightLen);

        return new TreeNode(nums[nums.length / 2], sortedArrayToBST(nums1), sortedArrayToBST(nums2));
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
