import java.util.ArrayDeque;
import java.util.Deque;

public class ServerLoadSpan {
    public int[] loadSpan(int[] load) {
        int[] span = new int[load.length];
        Deque<Integer> previousGreater = new ArrayDeque<>();
        for (int i = 0; i < load.length; i++) {
            while (!previousGreater.isEmpty() && load[previousGreater.peek()] <= load[i]) previousGreater.pop();
            span[i] = previousGreater.isEmpty() ? i + 1 : i - previousGreater.peek();
            previousGreater.push(i);
        }
        return span;
    }
}
