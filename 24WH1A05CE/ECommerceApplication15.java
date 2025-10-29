package javalab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Products{
	int id;
	String name;
	double price;
	Products(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

class Order2{
	int order_id;
	String date;
	List<Products>product;
	Order2(int order_id,String date,List<Products>product){
		this.order_id=order_id;
		this.date=date;
		this.product=product;
	}
	
}
class Seller{
	HashSet<Products>products=new HashSet<>();
	
	
	public void add_product(Products product) {
		products.add(product);
	}
	public HashSet<Products>get_products()
	{
		return products;
	}
	public double place_Order(List<Products>product){
		double total=0;
		for(Products p:product) {
			total+=p.price;
		}
		return total;
	}
}
public class ECommerceApp {

	public static void main(String[] args) {
		double total_amount=0;
		int product_count=0;
		Seller seller=new Seller();
		int order_count=0;
		String date="29-10-2025";
		seller.add_product(new Products(++product_count,"Laptop",155599.50));
		seller.add_product(new Products(++product_count,"Mobile Phone",27999.0));
		seller.add_product(new Products(++product_count,"Television",199999.0));
		for(Products p:seller.get_products()) {
			System.out.println(p.id +"."+ p.name + p.price);
		}
		List<Products>OrderedProducts=new ArrayList<>();
		OrderedProducts.add(new Products(1,"Laptop",155599.50));
		OrderedProducts.add(new Products(1,"Laptop",155599.50));
		OrderedProducts.add(new Products(2,"Mobile Phone",27999.0));
		Order2 order=new Order2(++order_count,date,OrderedProducts);
		total_amount=seller.place_Order(OrderedProducts);
		System.out.println("Total amount for the order Id:"+order.order_id+" " + "is:" +total_amount);
	}

}
