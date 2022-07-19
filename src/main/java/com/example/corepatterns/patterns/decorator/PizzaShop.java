package com.example.corepatterns.patterns.decorator;

public class PizzaShop {

    public static void main(String[] args) {
        Pizza pizza=new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();

    }
}
