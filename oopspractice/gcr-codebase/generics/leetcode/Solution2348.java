public class Solution2348 {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0, currentRun = 0;
        for (int n : nums) {
            if (n == 0) currentRun++;
            else currentRun = 0;
            total += currentRun;
        }
        return total;
    }
}