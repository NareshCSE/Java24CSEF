package javaprog;

import java.util.ArrayList;
import java.util.HashSet;



class Product{
	int id;
	String product_name;
	double price;
	
	Product(int id,String product_name,double price){
		this.id=id;
		this.product_name=product_name;
		this.price=price;
	}

	public int getId() {
		return id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product id=" + id + ", product_name=" + product_name + ", price=" + price ;
	}
	
		
}

class Seller{
	private HashSet<Product> productList = new HashSet<>();
	
	public void addProduct(Product P) {
		productList.add(P);
	}
	
	public void showProducts() {
		System.out.println("Available Products:");
		for(Product p:productList) {
			System.out.println(p);
		}
	}
	public HashSet<Product> getProduct(){
		return productList;
	}
}

class Customer{
	public void orderProduct(int[] ids,HashSet<Product>availableProducts) {
		double total=0;
		ArrayList<Product> ordered = new ArrayList<>();

        for (int id : ids) {
            for (Product p : availableProducts) {
                if (p.getId() == id) {
                    ordered.add(p);
                    total += p.getPrice();
                }
            }
        }
        
        if(ordered.isEmpty()) {
        	System.out.println("No matching Products");
        }else {
        	System.out.println("Products ordered are:");
        	for(Product p:ordered) {
        		System.out.println(p);
        	}
        	System.out.println("total:"+total);
        }
	}
}

public class exp_18 {

	public static void main(String[] args) {
		
		Seller seller=new Seller();
		
		seller.addProduct(new Product(101,"Phone",20000));
		seller.addProduct(new Product(102,"Laptop",70000));
		seller.addProduct(new Product(103,"Airpods",2000));
		
		seller.showProducts();
		
		Customer customer=new Customer();
		
		int[] orderId= {101,103};
		customer.orderProduct(orderId,seller.getProduct());
		
	

	}

}
