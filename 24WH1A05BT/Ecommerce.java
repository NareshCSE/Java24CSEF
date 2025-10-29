package javaPrograms;

import java.util.List;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

class Orders {
	int id;
	List<Product> products; 

	public Orders(int id, List<Product> products) {
		this.id = id;
		this.products = products;
	}
}

public interface Seller {
	void addProduct(Product product);
	List<Product> getProducts();
	void placeOrder(Orders order);
	double getBill(int orderId);
}


package javaPrograms;
import java.util.*;
public class Ecommerce implements Seller{
	List<Product> products = new ArrayList<>();
	List<Orders> orders = new ArrayList<>();
	int count = 0;

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public void placeOrder(Orders order) {
		orders.add(order);
		count++;
		System.out.println("Order placed successfully with ID: " + order.id);
	}

	@Override
	public double getBill(int orderId) {
		double total = 0;
		for (Orders o : orders) {
			if (o.id == orderId) {
				for (Product p : o.products) {
					total += p.price;
				}
				break;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e.addProduct(new Product(101, "Laptop", 120000));
		e.addProduct(new Product(102, "Mouse", 2500));
		e.addProduct(new Product(103, "Keyboard", 4500));
		for (Product p : e.getProducts()) {
			System.out.println(p.id + " - " + p.name + " : Rs " + p.price);
		}
		List<Product> orderItems1 = Arrays.asList(new Product(101, "Laptop", 120000), new Product(102, "Mouse", 2500));
		Orders order1 = new Orders(1, orderItems1);
		e.placeOrder(order1);
		List<Product> orderItems2 = Arrays.asList(new Product(103, "Keyboard", 4500));
		Orders order2 = new Orders(2, orderItems2);
		e.placeOrder(order2);
		System.out.println("\nBill for Order 1: Rs " + e.getBill(1));
		System.out.println("Bill for Order 2: Rs " + e.getBill(2));
	}
}
