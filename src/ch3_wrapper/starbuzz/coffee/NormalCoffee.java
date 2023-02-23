package ch3_wrapper.starbuzz.coffee;

import ch3_wrapper.starbuzz.Beverage;

public class NormalCoffee extends Beverage {
    public NormalCoffee() {
        this.description = "NormalCoffee";
    }

    @Override
    public double cost() {
        return 5;
    }
}
