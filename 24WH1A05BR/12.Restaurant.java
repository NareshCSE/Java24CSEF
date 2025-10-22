package labprograms;

import java.util.ArrayList;

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

    public String toString() {
        return "[ID=" + id + "] " + name + " - Rs." + price;
    }
}

class Order {
    private int orderId;
    private ArrayList<Item> orderedItems;
    private double totalAmount;

    public Order(int orderId, ArrayList<Item> orderedItems) {
        this.orderId = orderId;
        this.orderedItems = orderedItems;
        this.totalAmount = 0.0;
    }
    public int getOrderId() { return orderId; }
    public ArrayList<Item> getOrderedItems() { return orderedItems; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
