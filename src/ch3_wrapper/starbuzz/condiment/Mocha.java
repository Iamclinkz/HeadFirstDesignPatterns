package ch3_wrapper.starbuzz.condiment;

import ch3_wrapper.starbuzz.Beverage;
import ch3_wrapper.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 5 + wrapped.getCondimentAdditionalPrice()  + wrapped.cost();
    }
}
