import java.util.*;

public class Solution2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prevSort = "";
        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!sorted.equals(prevSort)) {
                res.add(w);
                prevSort = sorted;
            }
        }
        return res;
    }
}