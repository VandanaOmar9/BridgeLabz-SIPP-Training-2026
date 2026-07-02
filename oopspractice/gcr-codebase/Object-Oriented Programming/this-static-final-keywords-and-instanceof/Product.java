class Product {
    static int discount = 10;
    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(int d) {
        discount = d;
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 2, 101);
        if (p instanceof Product)
            System.out.println(p.productName + " " + discount + "%");
    }
}