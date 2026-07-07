interface LuggageScanner {
    boolean scanLuggage(double weight, boolean hasProhibitedItems);
    default void displayGuidelines() { System.out.println("Bags under 23kg. No prohibited items."); }
}

interface PassportVerifier {
    boolean verifyPassport(String passportNo);
    default void displayGuidelines() { System.out.println("Passports must be valid."); }
    static boolean isPassportValid(String pNo) { return pNo != null && pNo.matches("^[A-Z0-9]{8,9}$"); }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    public boolean scanLuggage(double w, boolean p) { return w <= 23.0 && !p; }
    public boolean verifyPassport(String pNo) { return PassportVerifier.isPassportValid(pNo); }
    
    public void displayGuidelines() {
        LuggageScanner.super.displayGuidelines();
        PassportVerifier.super.displayGuidelines();
    }
}

public class AirportSecurityManagement {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] passports = {"A1234567", "BAD123", "C7654321"};
        double[] weights = {18.5, 30.0, 22.0};
        boolean[] prohibited = {false, false, true};

        AirportSecuritySystem sys = new AirportSecuritySystem();
        sys.displayGuidelines();
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            boolean pass = sys.verifyPassport(passports[i]) && sys.scanLuggage(weights[i], prohibited[i]);
            System.out.println(names[i] + ": " + (pass ? "APPROVED" : "REJECTED"));
        }
    }
}