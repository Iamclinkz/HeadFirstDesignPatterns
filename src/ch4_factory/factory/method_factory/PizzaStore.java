package ch4_factory.factory.method_factory;

//这个类定义成abstract class的原因是需要面向接口编程，所以需要暴露方法让子类强行override，
//并且需要写一部分让所有子类都可以复用的代码。
//这样设计的好处是，让pizza的创建和使用解耦了。pizzaStore面向pizza接口编程，
//而具体的pizza类同样面向pizza接口编程，这样解耦了pizzaStore类和具体的pizza类。
//可以见书的p140的图
public abstract class PizzaStore {
    public Pizza orderPizza(String name)
    {
        Pizza pizza = createPizza(name);
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

    //把抽象的方法单独拎出来，让子类去实现，然后在本类（抽象类）中
    //依赖这个抽象的接口编程，并且编写一些所有的子类共用的代码。
    //这样同样符合"面向接口编程"的设计理念
    public abstract Pizza createPizza(String name);
}
