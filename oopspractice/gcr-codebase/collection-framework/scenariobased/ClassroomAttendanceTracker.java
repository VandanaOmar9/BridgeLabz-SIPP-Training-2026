import java.util.ArrayList;
import java.util.HashMap;

public class ClassroomAttendanceTracker {
    private HashMap<String, ArrayList<String>> attendanceMap = new HashMap<>();

    // 1 & 2. Mark attendance and prevent duplicates
    public void markAttendance(String subject, String student) {
        attendanceMap.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendanceMap.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Success: Marked " + student + " present for " + subject + ".");
        } else {
            System.out.println("Rejected: " + student + " is already marked present for " + subject + ".");
        }
    }

    // 3 & 4. Display subject lists and total headcounts
    public void displayAttendance() {
        System.out.println("\n--- Final Attendance Summary ---");
        for (String subject : attendanceMap.keySet()) {
            ArrayList<String> students = attendanceMap.get(subject);
            System.out.println("Subject: " + subject + " | Count: " + students.size());
            System.out.println("Students: " + students);
        }
    }

    public static void main(String[] args) {
        ClassroomAttendanceTracker tracker = new ClassroomAttendanceTracker();

        // Simulating marking attendance
        tracker.markAttendance("Java", "Alice");
        tracker.markAttendance("Java", "Bob");
        tracker.markAttendance("Java", "Alice"); // Duplicate
        tracker.markAttendance("Python", "Charlie");
        tracker.markAttendance("Python", "Alice");

        tracker.displayAttendance();
    }
}