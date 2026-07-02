class Patient {
    static String hospitalName = "City Hospital";
    static int total = 0;
    String name, ailment;
    int age;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        total++;
    }

    static void getTotalPatients() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        Patient p = new Patient("Vandana", 20, "Fever", 101);
        if (p instanceof Patient)
            System.out.println(p.name + " " + hospitalName);
        getTotalPatients();
    }
}