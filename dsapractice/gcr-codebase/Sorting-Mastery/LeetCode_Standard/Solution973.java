import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare((b[0]*b[0] + b[1]*b[1]), (a[0]*a[0] + a[1]*a[1]))
        );
        for (int[] p : points) {
            maxHeap.add(p);
            if (maxHeap.size() > k) maxHeap.poll();
        }
        int[][] res = new int[k][2];
        while (k > 0) res[--k] = maxHeap.poll();
        return res;
    }
}