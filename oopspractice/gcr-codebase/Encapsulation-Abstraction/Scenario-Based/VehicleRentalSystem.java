abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public abstract double calculateRentalCost(int days);

    public void displayInfo(int days) {
        System.out.println(vehicleType + " [" + vehicleNumber + "] - " + days + " days - Cost: " + calculateRentalCost(days));
    }
}

class Car extends Vehicle {
    private double dailyRate;

    public Car(String number, String type, double dailyRate) {
        super(number, type);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    public double calculateRentalCost(int days) { return days * dailyRate; }
}

class Bike extends Vehicle {
    private double dailyRate;

    public Bike(String number, String type, double dailyRate) {
        super(number, type);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    public double calculateRentalCost(int days) { return days * dailyRate; }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public Truck(String number, String type, double dailyRate, double loadingCharge) {
        super(number, type);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    public double getLoadingCharge() { return loadingCharge; }
    public void setLoadingCharge(double loadingCharge) { this.loadingCharge = loadingCharge; }

    public double calculateRentalCost(int days) { return (days * dailyRate) + loadingCharge; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("KA01AB1234", "Car", 1500);
        Vehicle bike = new Bike("KA02CD5678", "Bike", 400);
        Vehicle truck = new Truck("KA03EF9012", "Truck", 3000, 2000);

        car.displayInfo(3);
        bike.displayInfo(3);
        truck.displayInfo(3);
    }
}