import java.util.*;

public class Solution1834 {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] extTasks = new int[n][3];
        for (int i = 0; i < n; i++) {
            extTasks[i] = new int[]{tasks[i][0], tasks[i][1], i};
        }
        
        Arrays.sort(extTasks, Comparator.comparingInt(a -> a[0])); // Sort array by enqueue timeline
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2])
        );

        int[] res = new int[n];
        long time = 0;
        int i = 0, idx = 0;

        while (i < n || !pq.isEmpty()) {
            if (pq.isEmpty() && time < extTasks[i][0]) {
                time = extTasks[i][0];
            }
            while (i < n && extTasks[i][0] <= time) {
                pq.add(extTasks[i++]);
            }
            int[] current = pq.poll();
            time += current[1];
            res[idx++] = current[2];
        }
        return res;
    }
}