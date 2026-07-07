// Superclass
class Vehicle {
    private double maxSpeed;
    private String model;

    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public double getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public void displayVehicleInfo() {
        System.out.println("Model      : " + model);
        System.out.println("Max Speed  : " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass 1 - extends Vehicle only
class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    public ElectricVehicle(double maxSpeed, String model, double batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    public void charge() {
        System.out.println(getModel() + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Type       : Electric Vehicle");
        System.out.println("-----------------------------------");
    }
}

// Subclass 2 - extends Vehicle AND implements Refuelable (Hybrid Inheritance)
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    public PetrolVehicle(double maxSpeed, String model, double fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelTankCapacity() { return fuelTankCapacity; }
    public void setFuelTankCapacity(double fuelTankCapacity) { this.fuelTankCapacity = fuelTankCapacity; }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is refueling. Tank Capacity: " + fuelTankCapacity + " L");
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Type       : Petrol Vehicle");
        System.out.println("-----------------------------------");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(220, "Toyota Corolla", 50);

        System.out.println("=== Electric Vehicle ===");
        ev.displayVehicleInfo();
        ev.charge();
        System.out.println("-----------------------------------");

        System.out.println("=== Petrol Vehicle ===");
        pv.displayVehicleInfo();
        pv.refuel();
    }
}