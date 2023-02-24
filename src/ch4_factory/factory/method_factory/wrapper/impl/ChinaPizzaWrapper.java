package ch4_factory.factory.method_factory.wrapper.impl;

import ch4_factory.factory.method_factory.Pizza;
import ch4_factory.factory.method_factory.wrapper.PizzaWrapper;

public class ChinaPizzaWrapper extends PizzaWrapper {
    public ChinaPizzaWrapper(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public void prepare() {
        System.out.print("China pizza:");
        wrapped.prepare();
    }

    @Override
    public void bake() {
        System.out.print("China pizza:");
        wrapped.bake();
    }

    @Override
    public void cut() {
        System.out.print("China pizza:");
        wrapped.cut();
    }

    @Override
    public void box() {
        System.out.print("China pizza:");
        wrapped.box();
    }
}
