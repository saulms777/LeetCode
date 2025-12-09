import java.util.*;

public class P15_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    triplets.add(Arrays.asList(nums[i], nums[l++], nums[r]));
                    while (l < r && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        P15_3Sum p = new P15_3Sum();
        System.out.println(p.threeSum(new int[]{-1, 0, 1, 2, -1, -4})); // [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(p.threeSum(new int[]{0, 1, 1})); // []
        System.out.println(p.threeSum(new int[]{0, 0, 0})); // [[0, 0, 0]]
        System.out.println(p.threeSum(new int[]{0, 0, 0, 0}));
    }

}
