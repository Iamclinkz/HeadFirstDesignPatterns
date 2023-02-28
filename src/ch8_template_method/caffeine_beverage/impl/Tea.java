package ch8_template_method.caffeine_beverage.impl;

import ch8_template_method.caffeine_beverage.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("add tea...");
    }

    @Override
    public void addCondiment() {
        System.out.println("add a slice of lemon");
    }
}
