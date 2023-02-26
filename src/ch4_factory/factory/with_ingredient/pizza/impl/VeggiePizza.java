package ch4_factory.factory.with_ingredient.pizza.impl;

import ch4_factory.factory.with_ingredient.ingredient_factory.PizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.pizza.Pizza;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void  prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
