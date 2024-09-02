package factory.pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Cheese Pizza";
		dough = "Chicago Style Cheese Dough";
		sauce = "Chicago Style Cheese Sauce";
		toppingList.add("Chicago Topping");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
