import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> queue = new ArrayDeque<>();

    public void push(int x) {
        queue.offer(x);
        for (int i = 0, size = queue.size(); i < size - 1; i++) queue.offer(queue.remove());
    }

    public int pop() { return queue.remove(); }
    public int top() { return queue.element(); }
    public boolean empty() { return queue.isEmpty(); }
}
