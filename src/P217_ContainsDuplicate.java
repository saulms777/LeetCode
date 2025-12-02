import java.util.HashSet;

public class P217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n))
                return true;
            else set.add(n);
        }
        return false;
    }

}
