package intro;
class KFC implements Restaurant{
	private Item[] menu;
    private Order[] orders;
    private int menuCount;
    private int orderCount;

    public KFC(int maxMenuItems, int maxOrders) {
        menu = new Item[maxMenuItems];
        orders = new Order[maxOrders];
        menuCount = 0;
        orderCount=0;
    }

	@Override
	public void addItem(Item item) {
		if(menuCount==menu.length) {
			System.out.println("Menu is full");
		} else {
			menu[++menuCount]=item;
			System.out.println(item+" added to the menu");
		}
		
	}

	@Override
	public Item[] getMenu() {
		// TODO Auto-generated method stub
		return menu;
	}

	@Override
	public void placeOrder(Order order) {
		// TODO Auto-generated method stub
		if (orderCount < orders.length) {
            orders[orderCount++] = order;
            System.out.println("Order placed successfully! Order ID: " + order.getOrderId());
        } else {
            System.out.println("Cannot take more orders!");
        }
		
	}

	@Override
	public double generateBill(int orderId) {
		// TODO Auto-generated method stub
		for (Order order : orders) {
            if (order != null && order.getOrderId() == orderId) {
                double total = 0;
                for (int i = 0; i < order.getItemCount(); i++) {
                    total += order.getItems()[i].getPrice();
                }
                double tax = total * 0.06;
                double totalWithTax = total + tax;
                System.out.println("Bill for Order ID " + orderId + ": $" + totalWithTax + " (including 6% tax)");
                return totalWithTax;
            }
        }
        System.out.println("Order ID not found!");
        return 0;
	}
    
}
