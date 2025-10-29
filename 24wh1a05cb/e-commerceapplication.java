package application;
public class Product {
	private int id;
	private String name;
	private double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return "product id: " +id+" "+"Product name: " +name+" "+"Product price: "+price;
	}
}
package application;
import java.util.HashSet;
public class Seller {
	public HashSet<Product>products=new HashSet<>();
	public void addProduct(Product p) {
		products.add(p);
	}
	public HashSet<Product>getProducts(){
		return products;
	}
	public void displayProducts() {
		for(Product p:products) {
			System.out.println(p);
		}
	}

}
package application;
import java.util.List;
public class Customer {
	public void orderProducts(Seller seller,List<String>productNames) {
		double total=0;
		System.out.println("Products Ordered:");
		for(String name:productNames) {
			boolean found=false;
			for(Product p:seller.getProducts()) {
				if(p.getName().equalsIgnoreCase(name)) {
					System.out.println(p);
					total+=p.getPrice();
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println("Not Found: "+name);
			}
		}
		System.out.println("total price: "+total);
	}

}
package application;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.addProduct(new Product(101, "Vivo", 55000));
        seller.addProduct(new Product(102, "Oppo", 25000));
        seller.addProduct(new Product(103, "Redmi", 20000));
        seller.addProduct(new Product(104, "Realme", 15000));
        seller.addProduct(new Product(105,"Iphone",100000));
        seller.displayProducts();
        Customer customer = new Customer();
        List<String> orderList = Arrays.asList("vivo","Oppo","Poco");
        customer.orderProducts(seller, orderList);
    }
}
