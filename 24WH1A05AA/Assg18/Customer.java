package Assg18;

import java.util.HashSet;

public class Customer {

    public void orderProduct(int[] orderIds, HashSet<Product> availableProducts) {
        double total = 0;
        System.out.println("Order Details:");

        for (int id : orderIds) {
            boolean found = false;
            for (Product p : availableProducts) {
                if (p.getProduct_id() == id) {
                    System.out.println(p);
                    total += p.getCost();
                    found = true;
                    break;
                }
            } 
            if (!found) {
                System.out.println("Product ID " + id + " not found!");
            }
        }

        System.out.println("\nTotal Price: " + total);
    }
}

