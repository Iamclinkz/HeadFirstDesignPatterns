package ch4_factory.factory.method_factory.pizzaImpl;

import ch4_factory.factory.method_factory.Pizza;

public class PepperPizza extends Pizza {
    public PepperPizza() {
        toppings.add("Pepper");
    }

    @Override
    public void prepare() {
        System.out.println("PepperPizza prepare, with toppings:"+toppings.toString());
    }

    @Override
    public void bake() {
        System.out.println("PepperPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperPizza cut");
    }

    @Override
    public void box() {
        System.out.println("PepperPizza box");
    }
}
