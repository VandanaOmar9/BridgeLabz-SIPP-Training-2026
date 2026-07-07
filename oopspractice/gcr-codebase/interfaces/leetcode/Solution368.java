import java.util.*;

public class Solution368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length, max = 0, index = -1;
        Arrays.sort(nums);
        int[] dp = new int[n], parent = new int[n];
        Arrays.fill(dp, 1); Arrays.fill(parent, -1);
        
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1; parent[i] = j;
                }
            }
            if (dp[i] > max) { max = dp[i]; index = i; }
        }
        List<Integer> res = new ArrayList<>();
        while (index != -1) { res.add(nums[index]); index = parent[index]; }
        return res;
    }
}