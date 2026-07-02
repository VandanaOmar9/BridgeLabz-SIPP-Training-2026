class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "GLA";

    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    void display() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String n) {
        instituteName = n;
    }

    public static void main(String[] args) {
        Course c = new Course("Java", 6, 15000);
        c.display();
        updateInstituteName("ABC");
        c.display();
    }
}