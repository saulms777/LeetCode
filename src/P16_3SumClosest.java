import java.util.Arrays;

public class P16_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                if (sum < target) l++;
                else if (sum > target) r--;
                else return sum;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        P16_3SumClosest p = new P16_3SumClosest();
        System.out.println(p.threeSumClosest(new int[]{-1, 2, 1, -4}, 1)); // 2
        System.out.println(p.threeSumClosest(new int[]{0, 0, 0}, 1)); // 0
    }

}
