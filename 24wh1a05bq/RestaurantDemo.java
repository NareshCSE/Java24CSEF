package projects;

public class RestaurantDemo {

    static class Item {
        int id;
        String name;
        double price;

        Item(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

   
    static class Order {
        int orderId;
        Item[] items;

        Order(int orderId, Item[] items) {
            this.orderId = orderId;
            this.items = items;
        }
    }

    // Restaurant Interface
    interface Restaurant {
        void printName();
        void addItem(Item item);
        Item[] getMenu();
        Order placeOrder(int[] itemIds);
        double generateBill(int orderId);
    }

    // KFC class implements Restaurant
    static class KFC implements Restaurant {
        String name = "KFC";
        Item[] menu = new Item[10];  // max 10 
        int itemCount = 0;

        Order[] orders = new Order[10]; // max 10 
        int orderCount = 0;

        public void printName() {
            System.out.println("Welcome to " + name);
        }

       
        public void addItem(Item item) {
            if(itemCount < menu.length) {
                menu[itemCount++] = item;
            } else {
                System.out.println("Menu is full!");
            }
        }

      
        public Item[] getMenu() {
            Item[] currentMenu = new Item[itemCount];
            for(int i = 0; i < itemCount; i++) {
                currentMenu[i] = menu[i];
            }
            return currentMenu;
        }

       
        public Order placeOrder(int[] itemIds) {
            Item[] orderItems = new Item[itemIds.length];
            int count = 0;

            for(int i = 0; i < itemIds.length; i++) {
                for(int j = 0; j < itemCount; j++) {
                    if(menu[j].id == itemIds[i]) {
                        orderItems[count++] = menu[j];
                        break;
                    }
                }
            }

           
            Item[] finalItems = new Item[count];
            for(int i = 0; i < count; i++) {
                finalItems[i] = orderItems[i];
            }

            Order order = new Order(orderCount + 1, finalItems);
            if(orderCount < orders.length) {
                orders[orderCount++] = order;
                System.out.println("Order placed with Order ID: " + order.orderId);
            } else {
                System.out.println("Order list full!");
            }
            return order;
        }

      
        public double generateBill(int orderId) {
            for(int i = 0; i < orderCount; i++) {
                if(orders[i].orderId == orderId) {
                    double total = 0;
                    for(Item item : orders[i].items) {
                        total += item.price;
                    }
                    double tax = total * 0.06;
                    double totalAmount = total + tax;
                    System.out.printf("Total Bill for Order %d: %.2f (Including 6%% tax)\n", orderId, totalAmount);
                    return totalAmount;
                }
            }
            System.out.println("Invalid Order ID!");
            return 0;
        }
    }

    // Main 
    public static void main(String[] args) {
        KFC kfc = new KFC();

        kfc.printName();

       
        kfc.addItem(new Item(1, "Burger", 250));
        kfc.addItem(new Item(2, "Fries", 150));
        kfc.addItem(new Item(3, "Cola", 100));

       
        System.out.println("Menu:");
        for(Item item : kfc.getMenu()) {
            System.out.println(item.id + ". " + item.name + " - $" + item.price);
        }

     
        int[] orderItems = {1, 2};
        Order order = kfc.placeOrder(orderItems);

        //  bill
        kfc.generateBill(order.orderId);
    }
}
