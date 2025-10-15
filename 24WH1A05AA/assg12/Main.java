package intro;

public class Main{
    public static void main(String[] args) {
        
        KFC kfc = new KFC(5, 5);
        kfc.printRestaurantName("KFC");
        Item i1 = new Item(1,"burger", 150);
        Item i2 = new Item(2, "pizza", 120);
        Item i3 = new Item(3, "french fries", 80);

        kfc.addItem(i1);
        kfc.addItem(i2);
        kfc.addItem(i3);

        System.out.println("\n--- MENU ---");
        for (Item item : kfc.getMenu()) {
            if (item != null)
                System.out.println(item);
        }

        Order order1 = new Order(101, 5);
        order1.addItem(i1);
        order1.addItem(i3);

        kfc.placeOrder(order1);
        kfc.generateBill(101);
    }
}
