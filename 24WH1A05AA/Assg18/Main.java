package Assg18;

import java.util.Scanner;

public class Main {
	public  static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Seller s=new Seller();
		
		s.addProduct(new Product(11,"Car",150000));
		s.addProduct(new Product(12,"mobile",30500));
		s.addProduct(new Product(13,"sofa",45000));
		s.addProduct(new Product(14,"dress",3000));
		
		s.displayProducts();
		
		Customer c=new Customer();
		
		int  n;
		System.out.println("Enter the number of orders from available products");
		n=sc.nextInt();
		
		System.out.println("Enter the product ids of "+n+ " products");
		int[] orderids=new int[n];
		
		for(int i=0;i<n;i++) {
			orderids[i]=sc.nextInt();
			
		}
		c.orderProduct(orderids,s.getProducts());
		
		
		sc.close();
		
		
		
	}
}