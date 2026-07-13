public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int start = 0, maxCount = 0, maxLen = 0;
        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++counts[s.charAt(end) - 'A']);
            while ((end - start + 1) - maxCount > k) {
                counts[s.charAt(start++) - 'A']--;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}