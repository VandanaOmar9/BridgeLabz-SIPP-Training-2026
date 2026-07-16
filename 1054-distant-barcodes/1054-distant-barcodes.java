class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int[] freq = new int[10001];

        int max = 0, num = 0;
        for (int b : barcodes) {
            freq[b]++;
            if (freq[b] > max) {
                max = freq[b];
                num = b;
            }
        }

        int[] ans = new int[barcodes.length];
        int i = 0;

        while (freq[num]-- > 0) {
            ans[i] = num;
            i += 2;
        }

        for (int j = 0; j < freq.length; j++) {
            while (freq[j]-- > 0) {
                if (i >= barcodes.length) i = 1;
                ans[i] = j;
                i += 2;
            }
        }

        return ans;
    }
}