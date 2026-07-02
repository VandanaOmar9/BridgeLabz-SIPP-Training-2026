class Vehicle {
    String ownerName, vehicleType;
    static int registrationFee = 1000;

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void display() {
        System.out.println(ownerName + " " + vehicleType + " Fee=" + registrationFee);
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vandana", "Car");
        v.display();
        updateRegistrationFee(1500);
        v.display();
    }
}