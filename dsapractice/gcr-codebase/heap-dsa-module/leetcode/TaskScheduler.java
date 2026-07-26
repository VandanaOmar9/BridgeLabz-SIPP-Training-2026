public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxFreq = 0, maxFreqCount = 0;

        for (char t : tasks) {
            freq[t - 'A']++;
            maxFreq = Math.max(maxFreq, freq[t - 'A']);
        }

        for (int f : freq) {
            if (f == maxFreq) {
                maxFreqCount++;
            }
        }

        int emptySlots = (maxFreq - 1) * (n - (maxFreqCount - 1));
        int availableTasks = tasks.length - (maxFreq * maxFreqCount);
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }
}