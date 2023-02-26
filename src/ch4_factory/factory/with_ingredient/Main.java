package ch4_factory.factory.with_ingredient;

import ch4_factory.factory.with_ingredient.pizza_store.PizzaStore;
import ch4_factory.factory.with_ingredient.pizza_store.impl.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");
    }
}
