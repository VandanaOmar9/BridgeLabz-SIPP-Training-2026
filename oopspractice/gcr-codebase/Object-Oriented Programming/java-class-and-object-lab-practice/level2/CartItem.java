class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        } else {
            System.out.println("Not enough items in cart.");
        }
    }

    void displayTotalCost() {
        System.out.println("Item : " + itemName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Headphones", 2000);

        cart.addItem(3);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}