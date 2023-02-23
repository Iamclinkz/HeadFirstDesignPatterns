package ch3_wrapper.starbuzz.coffee;

import ch3_wrapper.starbuzz.Beverage;

public class DoubleCoffee extends Beverage {
    public DoubleCoffee()
    {
        //coffee们通过直接改变description，来改变
        //getDescription()的行为。因为饮料实体类之间互相没有继承关系，所以
        //description只能是其中一种饮料的描述
        this.description = "DoubleCoffee";
    }
    @Override
    public double cost() {
        return 10;
    }
}
