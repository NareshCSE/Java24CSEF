package javaPrograms;
class Item{
	String name;
	double price;
	Item(String n, double p){
		this.name = n;
		this.price = p;
	}
}
class Order{
	int orderId;
	Item[] items;
	Order(int ordId, Item[] i){
		this.orderId = ordId;
		this.items = i;
	}
}

public interface Restaurant {
	void addItem(Item item);
	Item[] getMenu();
	void placeOrder(Order o);
	double generateBill(int orderId);
}


package javaPrograms;

public class KFC implements Restaurant{
	Item[] menu = new Item[20];
	int count = 0;
	Order[] orders = new Order[20];
	int orderCount = 0;

	@Override
	public void addItem(Item item) {
		menu[count++] = item;
	}

	@Override
	public Item[] getMenu() {
		return menu;
	}

	@Override
	public void placeOrder(Order o) {
		orders[orderCount++] = o;
        System.out.println("Order placed with Id: " + o.orderId);
	}

	@Override
	public double generateBill(int orderId) {
		double bill = 0;
		for(int i = 0; i < orderCount; i++) {
			for (Item item : orders[i].items) {
	            bill += item.price;
	        }
		}
		double tax = bill * 0.06;
		bill += tax;
		return bill;
	}
	
	public static void main(String[] args) {
		KFC kfc = new KFC();
        kfc.addItem(new Item("Burger", 70));
        kfc.addItem(new Item("Fries", 50));
        kfc.addItem(new Item("Coke", 30));
        System.out.println("Menu:");
        for (Item item : kfc.getMenu()) {
        	if(item != null) {
        		System.out.println(item.name + " - Rs." + item.price);
        	}	
        }
        Item[] orderItems = { new Item("Burger", 70), new Item("Coke", 30) };
        Order order1 = new Order(1, orderItems);
        kfc.placeOrder(order1);
        double bill = kfc.generateBill(1);
		System.out.println("Total Bill: Rs." + bill);
	}


}
