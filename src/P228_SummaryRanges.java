import java.util.LinkedList;
import java.util.List;

public class P228_SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new LinkedList<>();
        if (nums.length == 0) return ranges;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int n : nums) {
            if (b == Integer.MAX_VALUE) a = n;
            else if (b + 1 != n) {
                if (a == b) ranges.add(a + "");
                else ranges.add(a + "->" + b);
                a = n;
            }
            b = n;
        }
        if (a == b) ranges.add(a + "");
        else ranges.add(a + "->" + b);
        return ranges;
    }

}
