public class Solution2110 {
    public long getDescentPeriods(int[] prices) {
        long total = 1, currentRun = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) currentRun++;
            else currentRun = 1;
            total += currentRun;
        }
        return total;
    }
}