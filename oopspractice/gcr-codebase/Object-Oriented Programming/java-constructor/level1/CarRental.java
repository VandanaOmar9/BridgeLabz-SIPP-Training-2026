class CarRental {
    String customerName, carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Swift";
        rentalDays = 1;
    }

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void display() {
        System.out.println(customerName);
        System.out.println(carModel);
        System.out.println("Cost = " + rentalDays * 1500);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Vandana", "Creta", 5);
        c.display();
    }
}