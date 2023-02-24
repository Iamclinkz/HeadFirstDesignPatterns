package ch4_factory.factory.method_factory.storeImpl;

import ch4_factory.factory.method_factory.Pizza;
import ch4_factory.factory.method_factory.PizzaStore;
import ch4_factory.factory.method_factory.wrapper.impl.USPizzaWrapper;
import ch4_factory.factory.method_factory.pizzaImpl.CheesePizza;
import ch4_factory.factory.method_factory.pizzaImpl.ClamPizza;
import ch4_factory.factory.method_factory.pizzaImpl.PepperPizza;

public class USPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if(name.equals("Cheese"))
        {
            return new USPizzaWrapper(new CheesePizza());
        }
        if(name.equals("Clam"))
        {
            return new USPizzaWrapper(new ClamPizza());
        }
        if(name.equals("Pepper"))
        {
            return new USPizzaWrapper(new PepperPizza());
        }
        return null;
    }
}
