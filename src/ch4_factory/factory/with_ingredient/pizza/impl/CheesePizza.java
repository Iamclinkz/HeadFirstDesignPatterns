package ch4_factory.factory.with_ingredient.pizza.impl;

import ch4_factory.factory.with_ingredient.ingredient_factory.PizzaIngredientFactory;
import ch4_factory.factory.with_ingredient.pizza.Pizza;

public class CheesePizza extends Pizza {
	//原料工厂类组合到具体的Pizza类中，并且在PizzaStore这一层进行组装，
	//这样全局来说，只有PizzaStore依赖具体的Pizza类，并且为Pizza类设置原料工厂。
	//这样做的目的是实现具体的Pizza和具体的调料解耦
	PizzaIngredientFactory ingredientFactory;
 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
