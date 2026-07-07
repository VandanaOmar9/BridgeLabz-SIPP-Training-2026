class Notification {
    String name, msg;
    Notification(String name, String msg) { this.name = name; this.msg = msg; }
    void sendNotification() { System.out.println("Sending alert to " + name); }
}

class EmailNotification extends Notification {
    EmailNotification(String n, String m) { super(n, m); }
    void sendNotification() { System.out.println("[Email] " + name + ": " + msg); }
}

class SMSNotification extends Notification {
    SMSNotification(String n, String m) { super(n, m); }
    void sendNotification() { System.out.println("[SMS] " + name + ": " + msg); }
}

class PushNotification extends Notification {
    PushNotification(String n, String m) { super(n, m); }
    void sendNotification() { System.out.println("[Push] " + name + ": " + msg); }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Notification[] list = {
            new EmailNotification("Alice", "Shipped."),
            new SMSNotification("Bob", "OTP: 4821."),
            new PushNotification("Charlie", "New Like!")
        };
        for (Notification n : list) n.sendNotification();
    }
}