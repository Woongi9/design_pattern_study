package factory.pizza;

public class Pizza {

	String name;
	String dough;
	String sauce;
	String topping;

	public Pizza() {
	}

	public Pizza(String name, String dough, String sauce, String topping) {
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
		this.topping = topping;
	}

	public void prepare() {

	}

	public void bake() {}
	public void cut() {}
	public void box() {}
}
