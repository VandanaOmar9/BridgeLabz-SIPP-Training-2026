class Employee {
    public int employeeID;
    protected String department;
    private double salary = 50000;

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    Manager() {
        employeeID = 101;
        department = "IT";
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.employeeID);
        System.out.println(m.department);
        System.out.println(m.getSalary());
    }
}