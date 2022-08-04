package com.example.corepatterns.patterns.stractural.facade;

public class OrderFacade {
   private OrderProcessor  processor = new OrderProcessor();
    public void processOrder(String name,int quantity){
        if(processor.checkStock(name)){
            String id=  processor.placeOrder(name,quantity);
            processor.shipOrder(id);
        }
    }
}
