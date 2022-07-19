package com.example.corepatterns.patterns.factory;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
