package ch4_factory.factory.method_factory;
import ch4_factory.factory.method_factory.storeImpl.ChinaPizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("testMakeStoreFactory");
        PizzaStore store = new ChinaPizzaStore();
        store.orderPizza("Cheese");
        System.out.println();
    }
}
