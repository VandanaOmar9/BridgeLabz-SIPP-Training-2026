public class Solution274 {
    public int hIndex(int[] citations) {
        int n = citations.length, total = 0;
        int[] buckets = new int[n + 1];
        for (int c : citations) buckets[Math.min(c, n)]++;
        for (int i = n; i >= 0; i--) {
            total += buckets[i];
            if (total >= i) return i;
        }
        return 0;
    }
}