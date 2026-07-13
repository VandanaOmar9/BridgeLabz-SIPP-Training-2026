import java.util.HashSet;

public class MaxSumDistinctSubarray {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long currentSum = 0, maxSum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end]) || set.size() >= k) {
                currentSum -= nums[start];
                set.remove(nums[start++]);
            }
            set.add(nums[end]);
            currentSum += nums[end];
            if (set.size() == k) maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}