package ch4_factory.factory.with_ingredient.ingredient_factory;


import ch4_factory.factory.with_ingredient.ingredient.*;

//因为原料的类型是固定的，所以这里可以把原料的类型抽象出来，
//由这个工厂负责提供所有的原料的获取方法。这样即可实现面向这个抽象的工厂类编程，而不是面向具体的原料编程。
//符合依赖倒置的原则。这种编程的思想即为工厂模式的抽象工厂。
//抽象工厂的内部封装了一个个的工厂方法，通过实现/继承抽象工厂类，然后实现/override每个方法，
//可以自定义的选择返回的每种原料的具体类型
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
