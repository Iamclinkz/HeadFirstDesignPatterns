package ch4_factory.factory.with_ingredient.pizza_store.impl;

import ch4_factory.factory.with_ingredient.ingredient_factory.PizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.ingredient_factory.impl.NYPizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.pizza.Pizza;
import ch4_factory.factory.with_ingredient.pizza.impl.*;
import ch4_factory.factory.with_ingredient.pizza_store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		//具体的PizzaStore面向具体的pizza类型，以及具体的PizzaFactory编程
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
