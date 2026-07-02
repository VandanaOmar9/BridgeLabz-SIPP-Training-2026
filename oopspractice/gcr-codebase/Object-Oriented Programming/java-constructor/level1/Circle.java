class Circle {
    double radius;

    Circle() {
        this(5);
    }

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area = " + 3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        c1.area();
        c2.area();
    }
}