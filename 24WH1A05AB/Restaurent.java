package Restaurent;
import java.util.*;


// Item class
class Item {
    int id;
    String name;
    double price;

    Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Item ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

// Order class
class Order {
    int orderId;
    List<Item> items;

    Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
    }
}

public interface Restaurent {
	 void printRestaurantName();
	    void addItem(Item item);
	    Item[] getMenu();
	    int placeOrder(List<Integer> itemIds);
	    double generateBill(int orderId);
	}

	// KFC Class implementing Restaurent
	class KFC implements Restaurent {
	    List<Item> menu = new ArrayList<>();
	    Map<Integer, Order> orders = new HashMap<>();
	    int orderCounter = 1;

	    public void printRestaurantName() {
	        System.out.println("Restaurant: KFC");
	    }

	    public void addItem(Item item) {
	        menu.add(item);
	    }

	    public Item[] getMenu() {
	        return menu.toArray(new Item[0]);
	    }

	    public int placeOrder(List<Integer> itemIds) {
	        List<Item> orderedItems = new ArrayList<>();
	        for (int id : itemIds) {
	            for (Item item : menu) {
	                if (item.id == id) {
	                    orderedItems.add(item);
	                    break;
	                }
	            }
	        }
	        int currentOrderId = orderCounter++;
	        orders.put(currentOrderId, new Order(currentOrderId, orderedItems));
	        System.out.println("Order placed successfully. Order ID: " + currentOrderId);
	        return currentOrderId;
	    }

	    public double generateBill(int orderId) {
	        Order order = orders.get(orderId);
	        if (order == null) {
	            System.out.println("Order not found.");
	            return 0;
	        }
	        double total = 0;
	        for (Item item : order.items) {
	            total += item.price;
	        }
	        double tax = total * 0.06;
	        double finalAmount = total + tax;
	        System.out.printf("Total before tax: $%.2f\n", total);
	        System.out.printf("Tax (6%%): $%.2f\n", tax);
	        System.out.printf("Final Bill Amount: $%.2f\n", finalAmount);
	        return finalAmount;
	    }
	}

	// Main class to run the program
	class RestaurantApp {
	    public static void main(String[] args) {
	        Restaurent kfc = new KFC();

	        kfc.printRestaurantName();

	        kfc.addItem(new Item(1, "Zinger Burger", 5.99));
	        kfc.addItem(new Item(2, "Fried Chicken", 3.49));
	        kfc.addItem(new Item(3, "Pepsi", 1.25));

	        System.out.println("\n--- MENU ---");
	        for (Item item : kfc.getMenu()) {
	            System.out.println(item);
	        }

	        List<Integer> orderItems = Arrays.asList(1, 3);
	        int orderId = kfc.placeOrder(orderItems);

	        System.out.println("\n--- BILL ---");
	        kfc.generateBill(orderId);
	    }
	}

	


