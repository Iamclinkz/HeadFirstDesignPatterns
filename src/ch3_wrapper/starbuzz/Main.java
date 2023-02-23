package ch3_wrapper.starbuzz;

import ch3_wrapper.starbuzz.coffee.DoubleCoffee;
import ch3_wrapper.starbuzz.condiment.Milk;
import ch3_wrapper.starbuzz.condiment.Mocha;

public class Main {
    public static void main(String[] args) {
        //来一杯double coffee
        Beverage myBeverage = new DoubleCoffee();
        myBeverage.setSize(Beverage.Size.VENTI);
        //加上一份奶，两份摩卡
        myBeverage = new Milk(myBeverage);
        myBeverage = new Mocha(myBeverage);
        myBeverage = new Mocha(myBeverage);

        System.out.println("cost: "+myBeverage.cost());
        System.out.println("description: "+myBeverage.getDescription());
    }
}
