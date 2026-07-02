class Student {
    public int roll;
    protected String name;
    private double cgpa;

    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent() {
        super(101, "Vandana", 8.5);
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent();
        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.getCGPA());
    }
}