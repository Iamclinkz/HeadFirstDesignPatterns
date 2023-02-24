package ch4_factory.factory.simple_factory.pizzaImpl;

import ch4_factory.factory.simple_factory.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        toppings.add("Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare, with toppings: "+toppings.toString());
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
