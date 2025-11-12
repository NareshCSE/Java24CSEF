package labprojects;

import labprojects.Item;
import labprojects.Order;
import labprojects.Restaurant;
	public class KFC implements Restaurant{
		private String name = "KFC";
	    private Item[] menu = new Item[10];
	    private Order[] orders = new Order[10];
	    private int itemCount = 0;
	    private int orderCount = 0;

	    public void printRestaurantName() {
	        System.out.println("Restaurant Name: " + name);
	    }

	    public void addItem(Item item) {
	        if (itemCount < menu.length) {
	            menu[itemCount++] = item;
	        } else {
	            System.out.println("Menu is full!");
	        }
	    }

	    public void showMenu() {
	        System.out.println("\n--- Menu ---");
	        System.out.printf("%-5s %-20s %-10s%n", "ID", "Name", "Price");
	        for (int i = 0; i < itemCount; i++) {
	            System.out.printf("%-5d %-20s %-10.2f%n", menu[i].id, menu[i].name, menu[i].price);
	        }
	    }

	    public Order placeOrder(int[] itemIds) {
	        Item[] orderedItems = new Item[itemIds.length];
	        double total = 0;

	        for (int i = 0; i < itemIds.length; i++) {
	            for (int j = 0; j < itemCount; j++) {
	                if (menu[j].id == itemIds[i]) {
	                    orderedItems[i] = menu[j];
	                    total += menu[j].price;
	                    break;
	                }
	            }
	        }

	        Order order = new Order(orderCount + 1, orderedItems, total);
	        orders[orderCount++] = order;
	        return order;
	    }

	    public double generateBill(int orderId) {
	        for (int i = 0; i < orderCount; i++) {
	            if (orders[i].orderId == orderId) {
	                double total = orders[i].totalAmount;
	                double gst = total * 0.06;
	                double grandTotal = total + gst;

	                System.out.println("\nAmount: " + total);
	                System.out.println("GST (6%): " + gst);
	                System.out.println("Total Bill: " + grandTotal);
	                return grandTotal;
	            }
	        }
	        System.out.println("Order not found!");
	        return 0;
	    }
	}

