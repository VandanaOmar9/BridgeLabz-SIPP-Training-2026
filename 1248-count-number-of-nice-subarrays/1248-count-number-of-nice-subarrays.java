import java.util.HashMap;
import java.util.Map;
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        int current = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            current += i % 2;
            result += map.getOrDefault(current - k, 0);
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return result;
        
    }
}