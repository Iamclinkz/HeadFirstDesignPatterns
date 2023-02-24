package ch4_factory.factory.method_factory.wrapper.impl;

import ch4_factory.factory.method_factory.Pizza;
import ch4_factory.factory.method_factory.wrapper.PizzaWrapper;

public class USPizzaWrapper extends PizzaWrapper {
    public USPizzaWrapper(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public void prepare() {
        System.out.print("US pizza:");
        wrapped.prepare();
    }

    @Override
    public void bake() {
        System.out.print("US pizza:");
        wrapped.prepare();
    }

    @Override
    public void cut() {
        System.out.print("US pizza:");
        wrapped.cut();
    }

    @Override
    public void box() {
        System.out.print("US pizza:");
        wrapped.box();
    }
}
