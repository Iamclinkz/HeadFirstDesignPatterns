package ch8_template_method.caffeine_beverage.impl;

import ch8_template_method.caffeine_beverage.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("add some coffee");
    }

    @Override
    public void addCondiment() {
        System.out.println("add some milk");
    }

    @Override
    public void hook()
    {
        System.out.println("on coffee hook, enjoy your coffee~");
    }
}
