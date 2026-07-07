abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Total Bill   : " + calculateBill());
        System.out.println("-----------------------------------");
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public InPatient(String patientId, String name, int age, double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) { this.roomCharges = roomCharges; }

    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(String patientId, String name, int age, double consultationFees, double treatmentCharges) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.treatmentCharges = treatmentCharges;
    }

    public double getConsultationFees() { return consultationFees; }
    public void setConsultationFees(double consultationFees) { this.consultationFees = consultationFees; }

    public double getTreatmentCharges() { return treatmentCharges; }
    public void setTreatmentCharges(double treatmentCharges) { this.treatmentCharges = treatmentCharges; }

    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P101", "Ravi Kumar", 45, 5000, 8000);
        Patient outPatient = new OutPatient("P202", "Sneha Reddy", 30, 500, 1200);

        System.out.println("=== In-Patient ===");
        inPatient.displayPatientDetails();

        System.out.println("=== Out-Patient ===");
        outPatient.displayPatientDetails();
    }
}