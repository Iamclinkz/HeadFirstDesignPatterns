package ch3_wrapper.starbuzz.coffee;

import ch3_wrapper.starbuzz.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        //正常的咖啡通过直接改变自己的description字段，从而改变
        //getDescription()的行为。
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
