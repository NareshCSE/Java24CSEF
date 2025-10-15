package interfaceDemo;
import java.util.Scanner;
public class KFC implements Restaurant{
	
    private String name = "KFC";
    private Item[] menu = new Item[10];
    private Order[] orders = new Order[10];
    private int menuCount = 0;
    private int orderCount = 0;
    private int nextOrderId = 100;

    public void printRestaurantName() {
        System.out.println("Welcome to " + name + "!");
    }

    public void addItem(Item item) {
        if (menuCount < menu.length) {
            menu[menuCount++] = item;
        } else {
            System.out.println("Menu is full!");
        }
    }

    public Item[] getMenu() {
        Item[] result = new Item[menuCount];
        for (int i = 0; i < menuCount; i++) {
            result[i] = menu[i];
        }
        return result;
    }

    public Order placeOrder(int[] itemIds) {
        Item[] selected = new Item[itemIds.length];
        int index = 0;

        for (int id : itemIds) {
            for (int i = 0; i < menuCount; i++) {
                if (menu[i].itemId == id) {
                    selected[index++] = menu[i];
                    break;
                }
            }
        }

        Order order = new Order(nextOrderId++, selected);
        if (orderCount < orders.length) {
            orders[orderCount++] = order;
        }
        System.out.println("Order placed successfully! Order ID: " + order.orderId);
        return order;
    }

    public double generateBill(int orderId) {
        Order order = null;
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].orderId == orderId) {
                order = orders[i];
                break;
            }
        }

        if (order == null) {
            System.out.println("Invalid order ID!");
            return 0;
        }

        double total = 0;
        System.out.println("Bill for Order ID: " + orderId);
        for (int i = 0; i < order.orderedItems.length; i++) {
            if (order.orderedItems[i] != null) {
                System.out.println(order.orderedItems[i].itemName + " - " + order.orderedItems[i].price);
                total += order.orderedItems[i].price;
            }
        }

        double tax = total * 0.06;
        double finalAmount = total + tax;

        System.out.println("Subtotal: " + total);
        System.out.println("Tax (6%): " + String.format("%.2f", tax));
        System.out.println("Total: " + String.format("%.2f", finalAmount));
        return finalAmount;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Restaurant kfc = new KFC();
        kfc.printRestaurantName();

        kfc.addItem(new Item(1, "Zinger Burger", 150));
        kfc.addItem(new Item(2, "Chicken Popcorn", 120));
        kfc.addItem(new Item(3, "Pepsi", 50));
        kfc.addItem(new Item(4, "French Fries", 80));

        int choice;
        int lastOrderId = -1;

        do {
            System.out.println("\nMENU: ");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Items:");
                    Item[] menu = kfc.getMenu();
                    for (Item it : menu)
                        System.out.println(it.itemId + ". " + it.itemName + " - " + it.price);
                    break;

                case 2:
                    System.out.print("How many items do you want to order? ");
                    int count = sc.nextInt();
                    int[] ids = new int[count];
                    System.out.println("Enter item IDs: ");
                    for (int i = 0; i < count; i++)
                        ids[i] = sc.nextInt();

                    Order order = kfc.placeOrder(ids);
                    lastOrderId = order.orderId;
                    break;

                case 3:
                    if (lastOrderId != -1) {
                        kfc.generateBill(lastOrderId);
                    } else {
                        System.out.println("No order found! Please place an order first.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for visiting KFC!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
    
}
