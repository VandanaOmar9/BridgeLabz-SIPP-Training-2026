import java.util.*;

public class RateLimiterWindow {
    public int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0, maxLen = 0;
        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);
                if (freq.get(leftKey) == 0) freq.remove(leftKey);
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}