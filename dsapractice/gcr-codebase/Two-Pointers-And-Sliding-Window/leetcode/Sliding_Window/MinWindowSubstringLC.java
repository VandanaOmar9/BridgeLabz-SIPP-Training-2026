public class MinWindowSubstringLC {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        int[] targetMap = new int[128];
        int[] windowMap = new int[128];
        for (char c : t.toCharArray()) targetMap[c]++;

        int start = 0, matched = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        int uniqueChars = 0;
        for (int count : targetMap) if (count > 0) uniqueChars++;

        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            windowMap[rightChar]++;
            if (targetMap[rightChar] > 0 && windowMap[rightChar] == targetMap[rightChar]) matched++;

            while (matched == uniqueChars) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }
                char leftChar = s.charAt(start);
                if (targetMap[leftChar] > 0 && windowMap[leftChar] == targetMap[leftChar]) matched--;
                windowMap[leftChar]--;
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}