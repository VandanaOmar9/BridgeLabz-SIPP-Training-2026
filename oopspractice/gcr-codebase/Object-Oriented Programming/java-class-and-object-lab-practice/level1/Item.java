class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem(int quantity) {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + (price * quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 55000);

        item.displayItem(2);
    }
}