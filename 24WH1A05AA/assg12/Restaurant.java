package intro;

interface Restaurant {
    default void printRestaurantName(String string) {
        System.out.println("Restaurant Name: KFC");
    }
    void addItem(Item item);             
    Item[] getMenu();                    
    void placeOrder(Order order);        
    double generateBill(int orderId);    
}