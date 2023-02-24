package ch4_factory.factory.method_factory.wrapper;

import ch4_factory.factory.method_factory.Pizza;

//书上没有的，自己根据上一章的wrapper瞎写的
public abstract class PizzaWrapper extends Pizza {
    protected Pizza wrapped;

    public PizzaWrapper(Pizza wrapped) {
        this.wrapped = wrapped;
    }
}
