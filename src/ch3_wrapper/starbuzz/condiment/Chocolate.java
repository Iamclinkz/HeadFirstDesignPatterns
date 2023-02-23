package ch3_wrapper.starbuzz.condiment;

import ch3_wrapper.starbuzz.Beverage;
import ch3_wrapper.starbuzz.CondimentDecorator;

public class Chocolate extends CondimentDecorator {
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        //这里千万不能写成super.getDescription()，
        //而是wrapped的描述+自身的描述
        return wrapped.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        //最终价格 = wrapped的价格 + 自己的价格
        return 3 + wrapped.getCondimentAdditionalPrice() + wrapped.cost();
    }
}
