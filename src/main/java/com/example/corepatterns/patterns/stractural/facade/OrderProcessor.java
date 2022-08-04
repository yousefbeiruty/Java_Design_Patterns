package com.example.corepatterns.patterns.stractural.facade;

public class OrderProcessor {

    public boolean checkStock(String name) {
        System.out.println("Checking stock");
        return true;
    }

    public String placeOrder(String name, int quantity) {
        System.out.println("Order Placed ");
        return "abc";
    }

    public void shipOrder(String orderId){
        System.out.println("Order Shipped");
    }
}
