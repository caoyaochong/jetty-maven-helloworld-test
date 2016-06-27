package cn.edu.zju.cst.examples.design.pattern.factory.factoryMethod;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	public abstract  Pizza createPizza(String type);

}
