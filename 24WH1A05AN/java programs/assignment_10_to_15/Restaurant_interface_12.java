package assignment_10_to_15;
class Item {
    String name;
    double price;
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class Order {
    int orderId;
    Item[] items;
    Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }
}
interface Restaurant {
    void printRestaurantName();
    void addItem(Item item);
    Item[] getMenu();
    Order placeOrder(int orderId, int[] itemIndices);
    double generateBill(Order order);
}
class KFC implements Restaurant {
    Item[] menu = new Item[10];
    int itemCount = 0;
    public void printRestaurantName() {
        System.out.println("Welcome to KFC!");
    }
    public void addItem(Item item) {
        menu[itemCount++] = item;
    }
    public Item[] getMenu() {
        return menu;
    }
    public Order placeOrder(int orderId, int[] itemIndices) {
        Item[] orderItems = new Item[itemIndices.length];
        for (int i = 0; i < itemIndices.length; i++) {
            orderItems[i] = menu[itemIndices[i]];
        }
        return new Order(orderId, orderItems);
    }
    public double generateBill(Order order) {
        double total = 0;
        for (Item item : order.items) {
            total += item.price;
        }
        return total + total * 0.06; // 6% tax
    }
}
public class Restaurant_interface_12 {
	public static void main(String[] args) {
		KFC kfc = new KFC();
        kfc.printRestaurantName();
        kfc.addItem(new Item("Burger", 120));
        kfc.addItem(new Item("Fries", 80));
        kfc.addItem(new Item("Pepsi", 50));
        Order order = kfc.placeOrder(101, new int[]{0,1,2});
        double bill = kfc.generateBill(order);
        System.out.println("Total Bill (with tax): ₹" + bill);
	}
}