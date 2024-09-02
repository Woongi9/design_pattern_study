package factory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;

	Dough dough;
	Sauce sauce;
	Cheese cheese;
	List<String> toppingList = new ArrayList<String>();

	abstract void prepare();

	public void setName(String name) {
		this.name = name;
	}

	public void bake() {}
	public void cut() {}
	public void box() {}
}
