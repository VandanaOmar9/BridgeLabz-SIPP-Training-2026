// Base class
class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderInfo() {
        System.out.println("Order ID     : " + orderId);
        System.out.println("Order Date   : " + orderDate);
        System.out.println("Order Status : " + getOrderStatus());
    }
}

// Level 1 subclass
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Tracking No. : " + trackingNumber);
    }
}

// Level 2 subclass (multilevel inheritance)
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(String deliveryDate) { this.deliveryDate = deliveryDate; }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("-----------------------------------");
    }
}

public class OnlineRetailOrderSystem {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2026-07-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2026-07-02", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2026-06-28", "TRK789012", "2026-07-03");

        System.out.println("=== Order (Base Level) ===");
        order.displayOrderInfo();
        System.out.println("-----------------------------------");

        System.out.println("=== Shipped Order ===");
        shippedOrder.displayOrderInfo();
        System.out.println("-----------------------------------");

        System.out.println("=== Delivered Order ===");
        deliveredOrder.displayOrderInfo();
    }
}