package ch4_factory.factory.with_ingredient.pizza_store.impl;

import ch4_factory.factory.with_ingredient.ingredient_factory.PizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.ingredient_factory.impl.ChicagoPizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.pizza.Pizza;
import ch4_factory.factory.with_ingredient.pizza.impl.*;
import ch4_factory.factory.with_ingredient.pizza_store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
	//具体的pizzaStore类负责选择原料工厂的类型，
	//并且实现PizzaStore的createPizza接口
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
