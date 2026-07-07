interface HeartRateMonitor {
    boolean checkHeartRate(int bpm);
    default void displayHealthTips() { System.out.println("Tip: Stay hydrated and aim for a resting heart rate between 60-100 BPM."); }
}

interface TemperatureMonitor {
    boolean checkTemperature(double temp);
    default void displayHealthTips() { System.out.println("Tip: Normal body temperature is around 98.6°F (37°C)."); }
    static boolean isPatientIdValid(String id) { return id != null && id.matches("^PID\\d{4}$"); }
}

class MonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    public boolean checkHeartRate(int bpm) { return bpm >= 60 && bpm <= 100; }
    public boolean checkTemperature(double temp) { return temp >= 97.0 && temp <= 99.5; }

    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }
}

public class HealthMonitoringSystem {
    public static void main(String[] args) {
        String[] names = {"John", "Emma", "Alex"};
        String[] ids = {"PID1001", "INVALID", "PID1002"};
        int[] heartRates = {75, 110, 80};
        double[] temps = {98.6, 98.2, 102.1};

        MonitoringSystem sys = new MonitoringSystem();
        sys.displayHealthTips();
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            boolean idValid = TemperatureMonitor.isPatientIdValid(ids[i]);
            boolean hrValid = sys.checkHeartRate(heartRates[i]);
            boolean tempValid = sys.checkTemperature(temps[i]);

            System.out.print(names[i] + " (" + ids[i] + "): ");
            if (!idValid) {
                System.out.println("REJECTED (Invalid Patient ID)");
            } else if (hrValid && tempValid) {
                System.out.println("NORMAL");
            } else {
                System.out.println("CRITICAL STATUS (Check Vital Signs)");
            }
        }
    }
}