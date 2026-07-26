import java.util.PriorityQueue;

public class ErTriage {
    public static class Patient {
        int priority;
        String name;

        public Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
    }

    // Min-heap: lower priority number = more urgent
    private final PriorityQueue<Patient> triageQueue = 
        new PriorityQueue<>((a, b) -> Integer.compare(a.priority, b.priority));

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        return triageQueue.poll(); // Returns null if empty
    }
}