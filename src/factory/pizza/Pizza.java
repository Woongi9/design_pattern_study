package factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppingList = new ArrayList<String>();

	public void prepare() {
		System.out.println("준비중 : " + name);
		System.out.println("도우 올리는중 : " + dough);
		System.out.println("sauce : " + sauce);
		System.out.println("topping : ");
		for (String topping : toppingList) {
			System.out.println(topping + " ");
		}
	}

	public void bake() {}
	public void cut() {}
	public void box() {}
}
