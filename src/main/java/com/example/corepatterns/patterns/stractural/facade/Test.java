package com.example.corepatterns.patterns.stractural.facade;

public class Test {

    public static void main(String[] args) {
       OrderFacade orderFacade=new OrderFacade();
       orderFacade.processOrder("MacBook",3);
    }
}
