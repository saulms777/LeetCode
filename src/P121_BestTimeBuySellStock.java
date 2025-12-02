public class P121_BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int low = 10000;
        int high = 0;
        int profit = 0;
        for (int day : prices) {
            if (day > high)
                high = day;
            if (day < low) {
                profit = Math.max(high - low, profit);
                low = day;
                high = 0;
            }
        }
        return Math.max(high - low, profit);
    }

}
