package ch8_template_method.caffeine_beverage;

import ch8_template_method.caffeine_beverage.impl.Coffee;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
    }
}
