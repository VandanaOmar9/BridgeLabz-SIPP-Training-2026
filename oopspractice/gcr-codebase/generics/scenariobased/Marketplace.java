interface Category {}
class BookCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    String name; double price;
    Product(String n, double p) { name = n; price = p; }
}

public class Marketplace {
    static <T extends Product<?>> void applyDiscount(T product, double pct) {
        product.price -= product.price * (pct / 100);
        System.out.println(product.name + " discounted price: $" + product.price);
    }

    public static void main(String[] args) {
        Product<GadgetCategory> phone = new Product<>("Smartphone", 1000.0);
        applyDiscount(phone, 10);
    }
}