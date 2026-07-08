import java.util.HashMap;

public class Solution974 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rem = 0, count = 0, prefixSum = 0;
        for (int n : nums) {
            prefixSum += n;
            rem = prefixSum % k;
            if (rem < 0) rem += k; // Handing negative remainders
            if (map.containsKey(rem)) count += map.get(rem);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}