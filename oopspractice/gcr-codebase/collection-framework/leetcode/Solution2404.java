import java.util.*;

public class Solution2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1, maxFreq = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                int freq = map.getOrDefault(n, 0) + 1;
                map.put(n, freq);
                if (freq > maxFreq || (freq == maxFreq && n < ans)) {
                    ans = n;
                    maxFreq = freq;
                }
            }
        }
        return ans;
    }
}