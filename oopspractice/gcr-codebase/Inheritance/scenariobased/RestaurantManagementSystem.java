// Superclass
class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public void displayPersonInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1 - extends Person AND implements Worker (Hybrid Inheritance)
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is preparing dishes specializing in " + specialty + " cuisine.");
    }

    public void displayInfo() {
        displayPersonInfo();
        System.out.println("Role      : Chef");
        System.out.println("Specialty : " + specialty);
        performDuties();
        System.out.println("-----------------------------------");
    }
}

// Subclass 2 - extends Person AND implements Worker (Hybrid Inheritance)
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, String id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public int getTablesAssigned() { return tablesAssigned; }
    public void setTablesAssigned(int tablesAssigned) { this.tablesAssigned = tablesAssigned; }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving " + tablesAssigned + " tables and taking orders.");
    }

    public void displayInfo() {
        displayPersonInfo();
        System.out.println("Role      : Waiter");
        System.out.println("Tables    : " + tablesAssigned);
        performDuties();
        System.out.println("-----------------------------------");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Ramesh Iyer", "CH01", "Italian");
        Waiter waiter = new Waiter("Anjali Nair", "WT01", 5);

        System.out.println("=== Chef ===");
        chef.displayInfo();

        System.out.println("=== Waiter ===");
        waiter.displayInfo();
    }
}