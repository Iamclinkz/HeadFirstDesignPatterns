package ch4_factory.factory.simple_factory;

import ch4_factory.factory.simple_factory.pizzaImpl.CheesePizza;
import ch4_factory.factory.simple_factory.pizzaImpl.ClamPizza;
import ch4_factory.factory.simple_factory.pizzaImpl.PepperPizza;

public class SimplePizzaFactoryImpl implements SimplePizzaFactory {
    //在工厂类的具体实现中，执行按照参数实例化
    public Pizza createPizza(String name)
    {
        if(name.equals("Cheese"))
        {
            return new CheesePizza();
        }
        if(name.equals("Clam"))
        {
            return new ClamPizza();
        }
        if(name.equals("Pepper"))
        {
            return new PepperPizza();
        }
        return null;
    }
}
