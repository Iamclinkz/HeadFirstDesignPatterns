package ch4_factory.factory.with_ingredient.ingredient_factory.impl;
import ch4_factory.factory.with_ingredient.ingredient.*;
import ch4_factory.factory.with_ingredient.ingredient.impl.*;
import ch4_factory.factory.with_ingredient.ingredient_factory.PizzaIngredientFactory;

//具体的调料工厂类，负责选择本类应该使用的具体调料。面向具体的调料编程
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
