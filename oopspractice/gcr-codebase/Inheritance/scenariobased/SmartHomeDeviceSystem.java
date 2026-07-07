// Superclass
class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}

// Subclass - single inheritance
class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public double getTemperatureSetting() { return temperatureSetting; }
    public void setTemperatureSetting(double temperatureSetting) { this.temperatureSetting = temperatureSetting; }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
        System.out.println("-----------------------------------");
    }
}

public class SmartHomeDeviceSystem {
    public static void main(String[] args) {
        Device genericDevice = new Device("DEV001", "ON");
        Thermostat thermostat = new Thermostat("THM101", "ON", 22.5);

        System.out.println("=== Generic Device ===");
        genericDevice.displayStatus();
        System.out.println("-----------------------------------");

        System.out.println("=== Thermostat ===");
        thermostat.displayStatus();
    }
}