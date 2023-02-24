package ch4_factory.factory.simple_factory;

import ch4_factory.factory.simple_factory.Pizza;

public interface SimplePizzaFactory {
    //因为pizza的创建是变化的（不确定的）部分，所以将这个部分单独的抽出来，
    //做成一个抽象类。然后在store的代码中面向这个抽象类编程。从抽象类中拿到pizza。
    //这样即可实现分离出变化的部分和不变的部分，并且面向接口编程。
    public Pizza createPizza(String name);
}
