class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String n, double p) {
        productName = n;
        price = p;
        totalProducts++;
    }

    void display() {
        System.out.println(productName + " " + price);
    }

    static void total() {
        System.out.println("Total Products = " + totalProducts);
    }

    public static void main(String[] args) {
        new Product("Laptop", 50000).display();
        new Product("Mouse", 500).display();
        total();
    }
}