import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {
    private final Deque<Integer> printQueue = new ArrayDeque<>();

    public void submitJob(int jobId) {
        printQueue.addLast(jobId); // normal job: joins the back
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId); // urgent job: jumps to the front
    }

    public int printNextJob() {
        if (printQueue.isEmpty()) throw new RuntimeException("No pending jobs");
        return printQueue.removeFirst(); // printer always takes from the front
    }
}