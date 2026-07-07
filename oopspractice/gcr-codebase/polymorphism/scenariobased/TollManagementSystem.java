class Vehicle {
    String vehicleNumber, ownerName;
    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }
    double calculateToll() { return 0.0; }
}

class Car extends Vehicle {
    Car(String num, String name) { super(num, name); }
    double calculateToll() { return 50.0; }
}

class Bus extends Vehicle {
    Bus(String num, String name) { super(num, name); }
    double calculateToll() { return 100.0; }
}

class Truck extends Vehicle {
    Truck(String num, String name) { super(num, name); }
    double calculateToll() { return 150.0; }
}

public class TollManagementSystem {
    
    static double calculateTotalRevenue(Vehicle[] vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) total += v.calculateToll();
        return total;
    }

    static void searchVehicle(Vehicle[] vehicles, String num) {
        for (Vehicle v : vehicles) {
            if (v.vehicleNumber.equalsIgnoreCase(num)) {
                System.out.println("Found: " + v.ownerName + " | Toll: " + v.calculateToll());
                return;
            }
        }
        System.out.println("Vehicle " + num + " not found.");
    }

    static void displayHighestToll(Vehicle[] vehicles) {
        if (vehicles.length == 0) return;
        Vehicle highest = vehicles[0];
        for (Vehicle v : vehicles) {
            if (v.calculateToll() > highest.calculateToll()) highest = v;
        }
        System.out.println("Highest Paid: " + highest.vehicleNumber + " ($" + highest.calculateToll() + ")");
    }

    static void countVehicleTypes(Vehicle[] vehicles) {
        int c = 0, b = 0, t = 0;
        for (Vehicle v : vehicles) {
            if (v instanceof Car) c++;
            else if (v instanceof Bus) b++;
            else if (v instanceof Truck) t++;
        }
        System.out.println("Counts -> Cars: " + c + ", Buses: " + b + ", Trucks: " + t);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", "Alice"),
            new Bus("BUS456", "Bob"),
            new Truck("TRK789", "Charlie"),
            new Car("CAR999", "David")
        };

        System.out.println("Total Revenue: $" + calculateTotalRevenue(vehicles));
        displayHighestToll(vehicles);
        countVehicleTypes(vehicles);
        searchVehicle(vehicles, "BUS456");
    }
}