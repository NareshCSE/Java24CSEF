package projects;
	import java.util.*;
	class Product {
	    private int id;
	    private String name;
	    private double price;
	    public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Product)) return false;
	        Product p = (Product) obj;
	        return id == p.id;
	    }
	  
	    public String toString() {
	        return"ProductID:"+ id+",Name:"+name+",Price:₹"+price;
	    }
	}
	class Seller {
	    private HashSet<Product> products = new HashSet<>();
	    public void addProduct(Product p) {
	        if (products.add(p)) {
	            System.out.println("✅ Product added:"+p);
	        } else {
	            System.out.println("⚠️ Product already exists: " + p.getName());
	        }
	    }
	    public HashSet<Product> getProducts() {
	        return products;
	    }
	    public void showProducts() {
	        System.out.println("\n --- Available Products ---");
	        for (Product p : products) {
	            System.out.println(p);
	        }
	    }
	}
	class Customer {
	    public void orderProducts(HashSet<Product> availableProducts, List<Integer> productIds) {
	        double total = 0;
	        System.out.println("\n--- Order Details ---");
	        for (int id : productIds) {
	            for (Product p : availableProducts) {
	                if (p.getId() == id) {
	                    System.out.println(p);
	                    total += p.getPrice();
	                }
	            }
	        }
	        System.out.println("-----");
	        System.out.println("Total Price: ₹" + total);
	    }
	}
	public class ECommerceApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Seller seller = new Seller();
	        seller.addProduct(new Product(101, "Laptop", 69000));
	        seller.addProduct(new Product(102, "samsung mobile", 22000));
	        seller.addProduct(new Product(103, "Headphones", 2500));
	        seller.addProduct(new Product(104, "Smartwatch", 5000));
	        seller.addProduct(new Product(105, "Lg Tv", 49000));
	        seller.addProduct(new Product(106, "Smart Bicycle", 2000));
	        seller.addProduct(new Product(107, "SonyTv", 95000));
	        seller.addProduct(new Product(108, "Tablet", 5000));
	        seller.addProduct(new Product(109, "iphone", 170000));	        
	        seller.showProducts();
	        Customer customer = new Customer();
	        System.out.print("\nEnter product IDs to order (comma separated): ");
	        String[] ids = sc.nextLine().split(",");
	        List<Integer> orderList = new ArrayList<>();
	        for (String id : ids) {
	            orderList.add(Integer.parseInt(id.trim()));
	        }
	        customer.orderProducts(seller.getProducts(), orderList);
	        sc.close();
	    }
	}


