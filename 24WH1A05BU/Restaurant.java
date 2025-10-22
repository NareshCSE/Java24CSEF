package Java;

public interface Restaurant {
    void printRestaurantName();
    String getRestaurantName();
    void addItem(Item item);
    Item[] getMenu();
    Order placeOrder(int[] itemIds);
    double generateBill(int orderId);
    class Item {
        private int id;
        private String name;
        private double price;
        public Item(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public int getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        @Override
        public String toString() {
            return id + " - " + name + " ($" + price + ")";
        }
    }
    class Order {
        private int orderId;
        private java.util.List<Item> items;
        private double totalAmount;

        public Order(int orderId, java.util.List<Item> items, double totalAmount) {
            this.orderId = orderId;
            this.items = items;
            this.totalAmount = totalAmount;
        }
        public int getOrderId() { return orderId; }
        public java.util.List<Item> getItems() { return items; }
        public double getTotalAmount() { return totalAmount; }
        @Override
        public String toString() {
            return "Order ID: " + orderId + ", Items: " + items + ", Total: $" + totalAmount;
        }
    }
}
//KFC
package Java;
import java.util.ArrayList;
import java.util.List;
public class KFC implements Restaurant {
    private String name = "KFC";
    private List<Item> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private int orderCounter = 1;
    @Override
    public void printRestaurantName() {
        System.out.println("Restaurant Name: " + getRestaurantName());
    }
    @Override
    public String getRestaurantName() {
        return name;
    }
    @Override
    public void addItem(Item item) {
        menu.add(item);
    }
    @Override
    public Item[] getMenu() {
        return menu.toArray(new Item[0]);
    }
    @Override
    public Order placeOrder(int[] itemIds) {
        List<Item> orderedItems = new ArrayList<>();
        double total = 0;
        for (int id : itemIds) {
            for (Item item : menu) {
                if (item.getId() == id) {
                    orderedItems.add(item);
                    total += item.getPrice();
                }
            }
        }
        Order order = new Order(orderCounter++, orderedItems, total);
        orders.add(order);
        return order;
    }
    @Override
    public double generateBill(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                double total = order.getTotalAmount();
                double gst = total * 0.06; 
                double grandTotal = total + gst;
                System.out.println("\nAmount: " + String.format("%.2f", total));
                System.out.println("Gst: " + String.format("%.2f", gst));
                System.out.println("Total bill: " + String.format("%.2f", grandTotal));
                return grandTotal;
            }
        }
        System.out.println("Order not found.");
        return 0;
    }
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.addItem(new Item(1, "Burger", 320));
        kfc.addItem(new Item(2, "Chicken nuggets", 260));
        kfc.addItem(new Item(3, "Pepsi", 60));
        kfc.printRestaurantName();
        System.out.println("\n--- Menu ---");
        System.out.printf("%-5s %-20s %-10s%n", "ID", "Name", "Price");
        for (Item item : kfc.getMenu()) {
            System.out.printf("%-5d %-20s %-10.2f%n", item.getId(), item.getName(), item.getPrice());
        }
        Order order = kfc.placeOrder(new int[]{1, 3});
        System.out.println("\nPlaced Order:");
        System.out.println(order);
        kfc.generateBill(order.getOrderId());

    }

}
