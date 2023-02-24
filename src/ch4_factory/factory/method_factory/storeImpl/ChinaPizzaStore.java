package ch4_factory.factory.method_factory.storeImpl;
import ch4_factory.factory.method_factory.Pizza;
import ch4_factory.factory.method_factory.PizzaStore;
import ch4_factory.factory.method_factory.wrapper.impl.ChinaPizzaWrapper;
import ch4_factory.factory.method_factory.pizzaImpl.CheesePizza;
import ch4_factory.factory.method_factory.pizzaImpl.ClamPizza;
import ch4_factory.factory.method_factory.pizzaImpl.PepperPizza;

public class ChinaPizzaStore extends PizzaStore {
    //在具体的PizzaStore的实现类中，override PizzaStore的抽象方法
    @Override
    public Pizza createPizza(String name) {
        if(name.equals("Cheese"))
        {
            //这个是我自己加的。。书上没有的。。因为PizzaStore这里是面向具体的pizza类型的
            //所以自己wrap一下pizza也是无所谓的吧~
            return new ChinaPizzaWrapper(new CheesePizza());
        }
        if(name.equals("Clam"))
        {
            return new ChinaPizzaWrapper(new ClamPizza());
        }
        if(name.equals("Pepper"))
        {
            return new ChinaPizzaWrapper(new PepperPizza());
        }
        return null;
    }
}
