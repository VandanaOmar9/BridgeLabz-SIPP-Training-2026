import java.util.ArrayList;

public class SmartParkingManager {
    private ArrayList<String> slots = new ArrayList<>();

    // 1. Add vehicle
    public void enterVehicle(String regNo) {
        slots.add(regNo);
        System.out.println(regNo + " entered.");
    }

    // 2. Remove vehicle
    public void exitVehicle(String regNo) {
        if (slots.remove(regNo)) System.out.println(regNo + " exited.");
        else System.out.println(regNo + " not found.");
    }

    // 3. Search vehicle
    public void searchVehicle(String regNo) {
        if (slots.contains(regNo)) System.out.println(regNo + " is parked.");
        else System.out.println(regNo + " is not parked.");
    }

    // 4. Display all parked vehicles
    public void displayStatus() {
        System.out.println("Parked: " + slots + " | Total Occupied: " + slots.size());
    }

    public static void main(String[] args) {
        SmartParkingManager pm = new SmartParkingManager();
        
        pm.enterVehicle("MH12-AB-1234");
        pm.enterVehicle("DL3C-XY-5678");
        pm.displayStatus();
        
        System.out.println();
        pm.searchVehicle("DL3C-XY-5678");
        
        System.out.println();
        pm.exitVehicle("MH12-AB-1234");
        pm.displayStatus();
    }
}