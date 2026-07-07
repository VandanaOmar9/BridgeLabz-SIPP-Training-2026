import java.util.Random;

interface FoodDelivery {
    void deliverFood(String item);
    default void trackOrder() { System.out.println("Food Tracking: Order picked up from restaurant and en route."); }
    
    static String generateDeliveryCode() {
        return "DEL-" + (1000 + new Random().nextInt(9000));
    }
}

interface GroceryDelivery {
    void deliverGrocery(String item);
    default void trackOrder() { System.out.println("Grocery Tracking: Packed from warehouse and en route."); }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    public void deliverFood(String item) { System.out.println("Delivering food package: " + item); }
    public void deliverGrocery(String item) { System.out.println("Delivering grocery bundle: " + item); }

    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        String[] customers = {"Liam", "Sophia", "Noah"};
        String[] foodItems = {"Pizza", "Burger", "None"};
        String[] groceryItems = {"None", "Milk & Eggs", "Fruits"};

        DeliveryExecutive executive = new DeliveryExecutive();

        for (int i = 0; i < customers.length; i++) {
            System.out.println("Customer: " + customers[i] + " | Code: " + FoodDelivery.generateDeliveryCode());
            executive.trackOrder();
            
            if (!foodItems[i].equals("None")) executive.deliverFood(foodItems[i]);
            if (!groceryItems[i].equals("None")) executive.deliverGrocery(groceryItems[i]);
            System.out.println();
        }
    }
}