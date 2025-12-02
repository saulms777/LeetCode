public class P26_RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniques = 1;
        int previous = nums[0];
        int i = 1;
        int j = 1;

        main: {
            while (j < nums.length) {
                if (nums[j] == previous) {
                    while (nums[j] == previous) {
                        j++;
                        if (j == nums.length) break main;
                    }
                }
                previous = nums[j];
                nums[i++] = nums[j];
                uniques++;
            }
        }
        return uniques;
    }

}
