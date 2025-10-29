package collections;
import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

}

class Order {
    private int orderId;
    private Date date;
    private List<Product> orderedProds;

    Order(int orderId) {
        this.orderId = orderId;
        this.date = new Date();
        this.orderedProds = new ArrayList<>();
    }

    public int getOrderId() { 
    	return orderId; 
    }
    
    public Date getDate() { 
    	return date; 
    }
    
    public List<Product> getOrderedProds() { 
    	return orderedProds; 
    }

    public void addProduct(Product p) {
        orderedProds.add(p);
    }
}

public class ECommerce {

    private HashSet<Product> products = new HashSet<>();
    private HashMap<Integer, Order> orders = new HashMap<>();
    
    private static int currentOrderId = 100;

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (Product p : products) {
            	System.out.println(p.getId() + ". " + p.getName() + " -- " + p.getPrice());
            }
        }
    }

    public boolean orderProduct(int orderId, int productId) {
        Order order = orders.get(orderId);
        if (order == null) {
            order = new Order(orderId);
            orders.put(orderId, order);
        }

        for (Product p : products) {
            if (p.getId() == productId) {
                order.addProduct(p);
                return true;
            }
        }
        return false;
    }

    public double getBill(int orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            System.out.println("Order not found!");
            return 0;
        }

        double total = 0;
        System.out.println("Ordered Products:");
        for (Product p : order.getOrderedProds()) {
        	System.out.println(p.getId() + ". " + p.getName() + " -- " + p.getPrice());
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ECommerce ec = new ECommerce();
        
        
        ec.addProduct(new Product(1, "Mobile", 15000));
        ec.addProduct(new Product(2, "Laptop", 55000));
        ec.addProduct(new Product(3, "Headphones", 2000));
        ec.addProduct(new Product(4, "Smart Watch", 3500));

        int choice;
        do {
            System.out.println("\nE-Commerce Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Show Products");
            System.out.println("3. Order Product");
            System.out.println("4. Get Bill");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = s.nextInt();
            
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = s.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = s.nextDouble();
                    ec.addProduct(new Product(id, name, price));
                    System.out.println("Product added.");
                    break;

                case 2:
                    ec.showProducts();
                    break;

                case 3:
                	   System.out.println("1. Create New Order");
                	    System.out.println("2. Add Items to Existing Order");
                	    System.out.print("Enter choice: ");
                	    int option = s.nextInt();

                	    int orderId;
                	    if(option == 1){
                	        orderId = ++currentOrderId;
                	        ec.orders.put(orderId, new Order(orderId));
                	        System.out.println("New Order Created. Order ID: " + orderId);
                	    } else {
                	        System.out.print("Enter Existing Order ID: ");
                	        orderId = s.nextInt();
                	        if (!ec.orders.containsKey(orderId)) {
                	            System.out.println("Order ID not found!");
                	            break;
                	        }
                	    }

                	    int prodId;
                	    do {
                	        ec.showProducts();
                	        System.out.print("Enter Product ID to add (0 to stop): ");
                	        prodId = s.nextInt();
                	        if (prodId != 0) {
                	            if (ec.orderProduct(orderId, prodId)) {
                	                System.out.println("Product Added.");
                	            } else {
                	                System.out.println("Invalid Product ID!");
                	            }
                	        }
                	    } while (prodId != 0);

                	    break;

                case 4:
                	System.out.print("Enter Order ID: ");
                    int oid = s.nextInt();
                    double total = ec.getBill(oid);
                    if(total > 0){
                        System.out.println("Total Bill: Rs. " + total);
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        s.close();
    }
}
