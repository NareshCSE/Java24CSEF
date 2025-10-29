package javalab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
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
	
}
public class ECommerceApp {

	public static void main(String[] args) {
		double total_amount=0;
		int product_count=0;
		Seller seller=new Seller();
		int order_count=0;
		String date="29-10-2025";
		seller.add_product(new Products(++product_count,"Laptop:",155599.50));
		seller.add_product(new Products(++product_count,"Mobile Phone:",27999.0));
		seller.add_product(new Products(++product_count,"Television:",199999.0));
		for(Products p:seller.get_products()) {
			System.out.println(p.id +"."+ p.name + p.price);
		}
		List<Products>OrderedProducts=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of items:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter product-ID:");
			int i1=sc.nextInt();
			for(Products p:seller.get_products())
			{
				if(i1==p.id)
				{
					total_amount+=p.price;
					
				}
			}
		}
		
		System.out.println("Total amount :" + "is :" +total_amount);
	}

}
