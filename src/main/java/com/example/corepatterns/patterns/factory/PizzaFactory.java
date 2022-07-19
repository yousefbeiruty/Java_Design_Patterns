package com.example.corepatterns.patterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "chicken" -> new ChickenPizza();
            default -> new VeggiePizza();
        };
        return pizza;
    }
}
