public class P27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int length = 0;
        int current = 0;
        int end = nums.length;
        while (current < end) {
            if (nums[current] == val) {
                end = nums.length - 1;
                while (nums[end] == val)
                    if (--end == current - 1) return length;
                int temp = nums[current];
                nums[current] = nums[end];
                nums[end] = temp;
            }
            length++;
            current++;
        }
        return length;
    }

}
