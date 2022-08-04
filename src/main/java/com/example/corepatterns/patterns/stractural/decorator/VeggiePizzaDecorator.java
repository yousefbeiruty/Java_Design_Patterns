package com.example.corepatterns.patterns.stractural.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {

    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        // Here we are decorating the  Pizza by adding Veggie
        // TODO:here it could be any type of Pizza base on the pizza object
        System.out.println("Adding Veggie Toppings");
    }
}
