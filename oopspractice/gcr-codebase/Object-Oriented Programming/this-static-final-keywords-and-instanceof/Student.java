class Student {
    static String universityName = "GLA";
    static int total = 0;
    String name, grade;
    final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        total++;
    }

    static void displayTotalStudents() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        Student s = new Student("Vandana", 23, "A");
        if (s instanceof Student)
            System.out.println(s.name + " " + s.rollNumber);
        displayTotalStudents();
    }
}