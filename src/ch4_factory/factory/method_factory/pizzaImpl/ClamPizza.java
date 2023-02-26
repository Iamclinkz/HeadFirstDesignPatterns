package ch4_factory.factory.method_factory.pizzaImpl;

import ch4_factory.factory.method_factory.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        toppings.add("Clam");
    }

    @Override
    public void prepare() {
        System.out.println("ch4_factory.factory.with_ingredient.pizza.impl.ClamPizza prepare, with toppings:"+toppings.toString());
    }

    @Override
    public void bake() {
        System.out.println("ch4_factory.factory.with_ingredient.pizza.impl.ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ch4_factory.factory.with_ingredient.pizza.impl.ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ch4_factory.factory.with_ingredient.pizza.impl.ClamPizza box");
    }
}
