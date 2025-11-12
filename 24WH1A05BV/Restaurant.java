package labprojects;

import labprojects.Item;
import labprojects.Order;

public interface Restaurant {
	void printRestaurantName();
    void addItem(Item item);
    void showMenu();
    Order placeOrder(int[] itemIds);
    double generateBill(int orderId);
}

class Item {
    int id;
    String name;
    double price;

    Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    Item[] items;
    double totalAmount;

    Order(int orderId, Item[] items, double totalAmount) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }
}
