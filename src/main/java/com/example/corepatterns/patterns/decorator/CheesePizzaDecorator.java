package com.example.corepatterns.patterns.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        // Here we are decorating the  Pizza by adding Cheese
        // TODO:here it could be any type of Pizza base on the pizza object
        System.out.println("Adding Cheese Toppings");
    }
}
