package ch4_factory.factory.simple_factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("testMakePizzaBySimpleFactory");
        SimplePizzaStore store = new SimplePizzaStore(new SimplePizzaFactoryImpl());
        store.orderPizza("Cheese");
        System.out.println();
    }
}
