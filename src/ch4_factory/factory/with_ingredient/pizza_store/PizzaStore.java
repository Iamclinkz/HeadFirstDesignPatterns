package ch4_factory.factory.with_ingredient.pizza_store;
import ch4_factory.factory.with_ingredient.pizza.Pizza;

public abstract class PizzaStore {

	//让子类继承之后，实现这个返回pizza的接口，然后返回Pizza
	protected abstract Pizza createPizza(String item);

	//面向Pizza接口的可被所有PizzaStore所复用的方法
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
