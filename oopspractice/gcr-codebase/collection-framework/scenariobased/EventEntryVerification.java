import java.util.HashSet;

public class EventEntryVerification {
    private HashSet<String> attendees = new HashSet<>();

    // 1 & 2. Register participant and prevent duplicates
    public void registerParticipant(String email) {
        if (attendees.add(email)) {
            System.out.println("Registration Successful: " + email);
        } else {
            System.out.println("Registration Rejected: " + email + " is already registered.");
        }
    }

    // 3 & 4. Display all unique participants and total count
    public void displaySummary() {
        System.out.println("\n--- Unique Registered Participants ---");
        for (String email : attendees) {
            System.out.println("- " + email);
        }
        System.out.println("Total Attendees Eligible to Enter: " + attendees.size());
    }

    public static void main(String[] args) {
        EventEntryVerification system = new EventEntryVerification();

        // Simulating registrations
        system.registerParticipant("alice@tech.com");
        system.registerParticipant("bob@design.com");
        system.registerParticipant("alice@tech.com"); // Duplicate entry
        system.registerParticipant("charlie@code.com");

        system.displaySummary();
    }
}