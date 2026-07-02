class Vehicle {
    static int registrationFee = 1000;
    String ownerName, vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vandana", "Car", 101);
        if (v instanceof Vehicle)
            System.out.println(v.ownerName + " " + registrationFee);
    }
}