package ch3_wrapper.starbuzz.condiment;

import ch3_wrapper.starbuzz.Beverage;
import ch3_wrapper.starbuzz.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 2.5 + wrapped.getCondimentAdditionalPrice()  + wrapped.cost();
    }
}
