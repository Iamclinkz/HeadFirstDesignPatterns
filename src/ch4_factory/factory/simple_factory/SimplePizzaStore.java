package ch4_factory.factory.simple_factory;

import ch4_factory.factory.simple_factory.Pizza;

public class SimplePizzaStore {
    //因为pizza的创建是变化的（不确定的）部分，所以将这个部分单独的抽出来，
    //做成一个抽象类。然后在store的代码中面向这个抽象类编程。从抽象类中拿到pizza。
    //这样即可实现分离出变化的部分和不变的部分，并且面向接口编程。
    private SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String name)
    {
        Pizza pizza = factory.createPizza(name);
        if(pizza == null)
        {
            System.out.println("no match pizza name!");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
