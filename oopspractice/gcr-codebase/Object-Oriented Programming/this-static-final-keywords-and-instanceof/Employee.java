class Employee {
    static String companyName = "TCS";
    static int total = 0;
    String name, designation;
    final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        total++;
    }

    static void displayTotalEmployees() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Vandana", 101, "Developer");
        if (e instanceof Employee)
            System.out.println(companyName + " " + e.name + " " + e.id);
        displayTotalEmployees();
    }
}