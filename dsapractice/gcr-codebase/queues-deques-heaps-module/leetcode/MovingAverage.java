import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverage {
    private final Queue<Integer> window;
    private final int size;
    private double sum;

    public MovingAverage(int size) {
        this.size = size;
        this.window = new ArrayDeque<>();
        this.sum = 0.0;
    }

    public double next(int val) {
        if (window.size() == size) {
            sum -= window.poll();
        }
        window.offer(val);
        sum += val;
        return sum / window.size();
    }
}