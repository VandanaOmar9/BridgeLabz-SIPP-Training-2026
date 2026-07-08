import java.util.*;

abstract class WarehouseItem { String name; WarehouseItem(String n) { name = n; } }
class Electronics extends WarehouseItem { Electronics(String n) { super(n); } }
class Groceries extends WarehouseItem { Groceries(String n) { super(n); } }

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item) { items.add(item); }
    List<T> getAll() { return items; }
}

public class WarehouseSystem {
    static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) System.out.println("- " + item.name);
    }

    public static void main(String[] args) {
        Storage<Electronics> elecStorage = new Storage<>();
        elecStorage.add(new Electronics("Laptop"));
        elecStorage.add(new Electronics("Phone"));

        System.out.println("Warehouse Items:");
        displayItems(elecStorage.getAll());
    }
}