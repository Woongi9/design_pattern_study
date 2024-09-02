package factory.order;

import factory.factory.Pizza;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String type, Pizza pizza);
}
