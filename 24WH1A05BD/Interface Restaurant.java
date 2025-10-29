package add;
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
    private Item[] menu = new Item[10];
    private int itemCount = 0;

    public void printRestaurantName() {
        System.out.println("Welcome to KFC:");
    }

    public void addItem(Item item) {
        if (itemCount < menu.length) {
            menu[itemCount++] = item;
        } else {
            System.out.println("Menu full, cannot add more items.");
        }
    }

    public Item[] getMenu() {
        Item[] currentMenu = new Item[itemCount];
        for (int i = 0; i < itemCount; i++) {
            currentMenu[i] = menu[i];
        }
        return currentMenu;
    }

    public Order placeOrder(int orderId, int[] itemIndices) {
        Item[] orderItems = new Item[itemIndices.length];
        for (int i = 0; i < itemIndices.length; i++) {
            int index = itemIndices[i];
            if (index >= 0 && index < itemCount) {
                orderItems[i] = menu[index];
            } else {
                System.out.println("Invalid item index: " + index);
            }
        }
        return new Order(orderId, orderItems);
    }

    public double generateBill(Order order) {
        double total = 0;
        for (Item item : order.items) {
            total += item.price;
        }
        return total + total * 0.06; 
    }
}
public class ass11 {

	public static void main(String[] args) {
        KFC kfc = new KFC();

        kfc.printRestaurantName();

        kfc.addItem(new Item("Burger", 120));
        kfc.addItem(new Item("Fries", 80));
        kfc.addItem(new Item("Pepsi", 60));

        int[] itemsOrdered = {0, 2}; 
        Order order = kfc.placeOrder(10, itemsOrdered);

        double bill = kfc.generateBill(order);
        System.out.println("Total Bill (with tax): " + bill);
		
		
		
	}

}
