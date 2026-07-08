import java.util.*;

class Astronaut {
    String id, name, specialization;

    Astronaut(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return name + " (" + id + ", " + specialization + ")";
    }
}

public class SpaceMissionManager {
    private Map<String, List<Astronaut>> missions = new HashMap<>();
    private Set<String> assignmentTracker = new HashSet<>(); // Format: "MissionName:AstronautId"

    // 1. Add new mission
    public void addMission(String missionName) {
        missions.putIfAbsent(missionName, new ArrayList<>());
        System.out.println("Mission '" + missionName + "' added successfully.");
    }

    // 2 & 3. Assign astronaut and prevent duplicate assignments
    public void assignAstronaut(String missionName, Astronaut astronaut) {
        if (!missions.containsKey(missionName)) {
            System.out.println("Error: Mission '" + missionName + "' does not exist.");
            return;
        }

        String trackingKey = missionName + ":" + astronaut.id;
        if (assignmentTracker.add(trackingKey)) {
            missions.get(missionName).add(astronaut);
            System.out.println("Assigned " + astronaut.name + " to " + missionName + ".");
        } else {
            System.out.println("Rejected: " + astronaut.name + " is already assigned to " + missionName + ".");
        }
    }

    // 4 & 5. Display all missions, crew details, and total headcounts
    public void displayMissions() {
        System.out.println("\n--- Space Agency Crew Allocation Summary ---");
        for (Map.Entry<String, List<Astronaut>> entry : missions.entrySet()) {
            String mission = entry.getKey();
            List<Astronaut> crew = entry.getValue();
            
            System.out.println("Mission: " + mission + " | Total Crew Size: " + crew.size());
            if (crew.isEmpty()) {
                System.out.println("  -> No astronauts assigned yet.");
            } else {
                for (Astronaut a : crew) {
                    System.out.println("  - " + a);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SpaceMissionManager manager = new SpaceMissionManager();

        // 1. Creating Missions
        manager.addMission("Artemis III");
        manager.addMission("Mars One");

        // Creating Astronauts
        Astronaut a1 = new Astronaut("AST01", "Neil", "Commander");
        Astronaut a2 = new Astronaut("AST02", "Buzz", "Pilot");
        Astronaut a3 = new Astronaut("AST03", "Sally", "Geologist");

        System.out.println();

        // 2 & 3. Simulating Assignments
        manager.assignAstronaut("Artemis III", a1);
        manager.assignAstronaut("Artemis III", a2);
        manager.assignAstronaut("Artemis III", a1); // Duplicate attempt
        manager.assignAstronaut("Mars One", a1);     // Allowed on a different mission
        manager.assignAstronaut("Mars One", a3);

        // 4 & 5. Final Output Display
        manager.displayMissions();
    }
}