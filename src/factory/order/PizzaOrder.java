package factory.order;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.PepperoniPizza;
import factory.pizza.Pizza;

public class PizzaOrder {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza =  new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza =  new PepperoniPizza();
		} else if (type.equals("greek")) {
			pizza =  new GreekPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
