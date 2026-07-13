public class CpuSpikeDetector {
    public int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE, start = 0;
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start++];
            }
        }
        return maxSum;
    }
}