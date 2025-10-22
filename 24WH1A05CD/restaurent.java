package javalab;
class Item{
	String name;
	double price;
	Item(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
}

class Order{
	int Order_id;
	double amount;
	Item[]items;
	Order(int Order_id,double amount,Item[]items)
	{
		this.Order_id=Order_id;
		this.amount=amount;
		this.items=items;
	}
	
}



interface restaurant{
	void print_name();
	void add_Item(Item item);
	Item[] get_menu();
	Order place_order(Item[]items);
	double generate_bill(int Order_id);
}
class KFC implements restaurant{
	String restaurantName = "KFC";
	Item[]menu=new Item[10];
	Order[]orders=new Order[50];
	int itemcnt=0;
    int Order_cnt=0;
	public void print_name() {
		System.out.println("Name of the restauranr: "+restaurantName);
	}
	public void add_Item(Item item) {
		menu[itemcnt++]=item;
	}
	public Item[] get_menu(){
		Item[]current=new Item[itemcnt];
		
		for(int i=0;i<itemcnt;i++)
		{
			current[i]=menu[i];
		}
		return current;
	}
	public Order place_order(Item[]items){
		double total=0;
		for(Item v:items) {
			total+=v.price;
		}
		Order order=new Order(Order_cnt,total,items);
		orders[Order_cnt++]=order;
		System.out.println("Order placed with order Id"+order.Order_id+1);
		
		return order;
	}
	public double generate_bill(int Order_id) {
		if(Order_id>Order_cnt) {
			System.out.println("Invalid");
			return 0;
		}
		else {
			Order order=orders[Order_id];
			
			double tax=0.06*order.amount;
			double bill=order.amount+tax;
			return bill;
		}
	}
	
}





public class Restaurantprogram {

	public static void main(String[] args) {
		KFC kfc=new KFC();
		kfc.print_name();
		Item item1=new Item("Burger",55.0);
		kfc.add_Item(item1);
		Item item2=new Item("Coffe",35.0);
		kfc.add_Item(item2);
		Item item3=new Item("Pizza",65.0);
		kfc.add_Item(item3);
		System.out.println("MENU:");
		for (Item item:kfc.get_menu())
		{
			System.out.println(item.name+"-"+item.price);
		}
		Item[]orderedItems= {new Item("Burger",55.0),new Item("Coffe",35.0)};
		Order order=kfc.place_order(orderedItems);
		System.out.println("Total bill for "+order.Order_id+1 +" is "+ kfc.generate_bill(order.Order_id));

	}

}
