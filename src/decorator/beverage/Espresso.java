package decorator.beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public double cost() {
		return 3000;
	}
}
