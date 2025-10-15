package interfaceDemo;

class Item {
	int itemId;
	String itemName;
	double price;

	Item(int itemId, String itemName, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
}

class Order {
	int orderId;
	Item[] orderedItems;

	Order(int orderId, Item[] orderedItems) {
		this.orderId = orderId;
		this.orderedItems = orderedItems;
	}
}

interface Restaurant {
	void printRestaurantName();
	void addItem(Item item);
	Item[] getMenu();
	Order placeOrder(int[] itemIds);
	double generateBill(int orderId);
}
