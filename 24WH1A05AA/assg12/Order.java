package intro;
class Order {
    private int orderId;
    private Item[] items;
    private int itemCount;


    public Order(int orderId, int maxItems) {
        this.orderId = orderId;
        this.items = new Item[maxItems];
        this.itemCount = 0;
    }

    public int getOrderId() { 
    	return orderId; 
    	}

    public Item[] getItems() { 
    	return items; 
    	}

    public int getItemCount() { 
    	return itemCount; 
    	}
    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Cannot add more items to this order!");
        }
  }


    
}