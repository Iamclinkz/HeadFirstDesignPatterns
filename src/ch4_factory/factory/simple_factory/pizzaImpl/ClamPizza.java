package ch4_factory.factory.simple_factory.pizzaImpl;

import ch4_factory.factory.simple_factory.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        toppings.add("Clam");
    }

    @Override
    public void prepare() {
        System.out.println("ClamPizza prepare, with toppings:"+toppings.toString());
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza box");
    }
}
