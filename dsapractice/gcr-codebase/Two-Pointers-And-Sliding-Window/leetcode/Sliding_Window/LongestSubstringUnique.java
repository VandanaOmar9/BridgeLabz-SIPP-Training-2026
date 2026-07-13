import java.util.HashSet;

public class LongestSubstringUnique {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, maxLen = 0;
        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}