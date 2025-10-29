package Assg18;

import java.util.HashSet;

public class Seller {
	
	    private HashSet<Product> productSet = new HashSet<>();

	    public void addProduct(Product p) {
	        productSet.add(p);
	    }

	    public HashSet<Product> getProducts() {
	        return productSet;
	    }

	    public void displayProducts() {
	        System.out.println("Available Products:");
	        for (Product p : productSet) {
	            System.out.println(p);
	        }
	    }
	}


