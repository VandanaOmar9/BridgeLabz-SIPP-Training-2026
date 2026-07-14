import java.util.ArrayDeque;
import java.util.Deque;

public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> increasing = new ArrayDeque<>();
        int largest = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = i == heights.length ? 0 : heights[i];
            while (!increasing.isEmpty() && heights[increasing.peek()] > currentHeight) {
                int height = heights[increasing.pop()];
                int leftBoundary = increasing.isEmpty() ? -1 : increasing.peek();
                largest = Math.max(largest, height * (i - leftBoundary - 1));
            }
            increasing.push(i);
        }
        return largest;
    }
}
