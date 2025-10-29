package Producct;
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

 @Override
 public String toString() {
     return "Product ID: " + id + ", Name: " + name + ", Price: " + price;
 }
 @Override
 public int hashCode() {
     return Objects.hash(id);
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Product other = (Product) obj;
     return id == other.id;
 }
}

class Seller {
 private HashSet<Product> productSet = new HashSet<>();

 public void addProduct(Product p) {
     productSet.add(p);
 }

 public HashSet<Product> getProducts() {
     return productSet;
 }

 public void showAllProducts() {
     System.out.println("\nAvailable Products:");
     for (Product p : productSet) {
         System.out.println(p);
     }
 }
}
class Customer {
 public void orderProducts(Seller seller) {
     Scanner sc = new Scanner(System.in);
     double total = 0;
     ArrayList<Product> ordered = new ArrayList<>();

     System.out.print("\nEnter number of products to order: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         System.out.print("Enter Product ID to order: ");
         int id = sc.nextInt();
         boolean found = false;

         for (Product p : seller.getProducts()) {
             if (p.getId() == id) {
                 ordered.add(p);
                 total += p.getPrice();
                 found = true;
                 break;
             }
         }

         if (!found) {
             System.out.println("❌ Product with ID " + id + " not found!");
         }
     }

     System.out.println("\n----- Order Details -----");
     for (Product p : ordered) {
         System.out.println(p);
     }
     System.out.println("Total Price = " + total);
 }

 public static void main(String[] args) {
     Seller seller = new Seller();

     // Seller adds products
     seller.addProduct(new Product(1, "Laptop", 50000));
     seller.addProduct(new Product(2, "Mobile", 20000));
     seller.addProduct(new Product(3, "Headphones", 1500));
     seller.addProduct(new Product(4, "Keyboard", 800));

     seller.showAllProducts();

     // Customer orders products
     Customer customer = new Customer();
     customer.orderProducts(seller);
 }
}


