package labprograms;
import java.util.Scanner;
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
        System.out.println("\n🍗 Welcome to KFC! 🍔");
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
public class exp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KFC kfc = new KFC();
        kfc.printRestaurantName();
        System.out.print("Enter number of menu items: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter item price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline
            kfc.addItem(new Item(name, price));
        }
        System.out.println("\n--- KFC MENU ---");
        Item[] menu = kfc.getMenu();
        for (int i = 0; i < n; i++) {
            System.out.println(i + ". " + menu[i].name + " - ₹" + menu[i].price);
        }
        System.out.print("\nEnter order ID: ");
        int orderId = sc.nextInt();

        System.out.print("How many items do you want to order? ");
        int m = sc.nextInt();
        int[] itemIndices = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter item index #" + (i + 1) + ": ");
            itemIndices[i] = sc.nextInt();
        }
        Order order = kfc.placeOrder(orderId, itemIndices);
        double bill = kfc.generateBill(order);

        System.out.println("\nYour Order ID: " + orderId);
        System.out.println("Items Ordered:");
        for (Item item : order.items) {
            System.out.println("- " + item.name + " (₹" + item.price + ")");
        }
        System.out.println("Total Bill (with 6% tax): ₹" + String.format("%.2f", bill));

        sc.close();
    }
}
