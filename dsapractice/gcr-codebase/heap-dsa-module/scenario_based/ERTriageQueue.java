import java.util.PriorityQueue;

public class ERTriageQueue {
    public static class Patient {
        public String name;
        public int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    private final PriorityQueue<Patient> triageQueue = 
        new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }
}