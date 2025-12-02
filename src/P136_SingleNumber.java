public class P136_SingleNumber {

    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums)
            n ^= num;
        return n;
    }

}
