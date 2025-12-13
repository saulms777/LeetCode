import java.util.*;

public class P18_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> quads = new HashSet<>();
        for (int a = 0; a < nums.length - 3; a++) {
            for (int b = a + 1; b < nums.length - 2; b++) {
                int l = b + 1, r = nums.length - 1;
                while (l < r) {
                    long sum = (long) nums[a] + (long) nums[b] + (long) nums[l] + (long) nums[r];
                    if (sum < target) l++;
                    else if (sum > target) r--;
                    else {
                        quads.add(Arrays.asList(nums[a], nums[b], nums[l++], nums[r]));
                        while (l < r && nums[l] == nums[l - 1]) l++;
                    }
                }
            }
        }
        return quads.stream().toList();
    }

    public static void main(String[] args) {
        P18_4Sum p = new P18_4Sum();
        System.out.println(p.fourSum(new int[]{1,0,-1,0,-2,2}, 0)); // [[-2, 0, 0, 2], [-2, -1, 1, 2], [-1, 0, 0, 1]]
        System.out.println(p.fourSum(new int[]{2,2,2,2,2}, 8)); // [[2, 2, 2, 2]]
        System.out.println(p.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296)); // []
    }

}
