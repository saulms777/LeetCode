public class P35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length - 1;
        int middle;

        if (nums.length == 0 || target <= nums[lower]) return 0;
        else if (target == nums[higher]) return higher;
        else if (target > nums[higher]) return higher + 1;

        while (lower <= higher) {
            middle = (lower + higher) / 2;
            if (target < nums[middle])
                higher = middle - 1;
            else if (target > nums[middle])
                lower = middle + 1;
            else return middle;
        }

        return lower;
    }

}
