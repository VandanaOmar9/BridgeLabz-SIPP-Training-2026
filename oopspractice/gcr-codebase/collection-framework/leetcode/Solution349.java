import java.util.*;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>(), intersect = new HashSet<>();
        for (int n : nums1) set.add(n);
        for (int n : nums2) if (set.contains(n)) intersect.add(n);
        
        int[] res = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) res[i++] = num;
        return res;
    }
}