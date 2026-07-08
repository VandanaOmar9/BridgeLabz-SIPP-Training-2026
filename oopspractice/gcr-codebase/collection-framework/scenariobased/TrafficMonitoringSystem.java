import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TrafficMonitoringSystem {
    private HashMap<String, Integer> trafficMap = new HashMap<>();

    // 1. Add or update vehicle counts
    public void recordVehicle(String roadName, int count) {
        trafficMap.put(roadName, trafficMap.getOrDefault(roadName, 0) + count);
        System.out.println("Recorded " + count + " vehicles on " + roadName + ".");
    }

    // 2, 3, 4 & 5. Generate Report, Sort data, and find busiest road
    public void generateTrafficReport() {
        System.out.println("\n================ SMART CITY TRAFFIC REPORT ================");
        
        // 5. Display total number of roads monitored
        System.out.println("Total Roads Monitored: " + trafficMap.size());
        if (trafficMap.isEmpty()) {
            System.out.println("No traffic data available.");
            return;
        }

        // 2. Use a TreeMap to sort roads alphabetically by name
        TreeMap<String, Integer> sortedTraffic = new TreeMap<>(trafficMap);
        
        String busiestRoad = "";
        int maxVehicles = -1;

        System.out.println("\n--- Road-wise Vehicle Breakdown (Sorted) ---");
        for (Map.Entry<String, Integer> entry : sortedTraffic.entrySet()) {
            String road = entry.getKey();
            int count = entry.getValue();
            
            // Determine traffic status for analysis report
            String status = (count > 500) ? "HEAVY TRAFFIC" : (count > 200) ? "MODERATE" : "CLEAR";
            System.out.println("Road: " + road + " | Vehicles: " + count + " | Status: " + status);

            // 3. Track the busiest road
            if (count > maxVehicles) {
                maxVehicles = count;
                busiestRoad = road;
            }
        }

        System.out.println("\n---------------------------------------------------------");
        System.out.println("Busiest Road: " + busiestRoad + " (" + maxVehicles + " vehicles)");
        System.out.println("=========================================================");
    }

    public static void main(String[] args) {
        TrafficMonitoringSystem system = new TrafficMonitoringSystem();

        // 1. Simulating traffic tracking updates
        system.recordVehicle("Main Street", 350);
        system.recordVehicle("Broadway Avenue", 600);
        system.recordVehicle("Sunset Boulevard", 120);
        system.recordVehicle("Main Street", 200); // Updating existing road count

        // 2, 3, 4, 5. Outputting operations and reports
        system.generateTrafficReport();
    }
}