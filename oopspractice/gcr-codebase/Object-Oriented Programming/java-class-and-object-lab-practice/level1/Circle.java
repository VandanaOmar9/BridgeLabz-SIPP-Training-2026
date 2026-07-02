class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);

        c.display();
    }
}