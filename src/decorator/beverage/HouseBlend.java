package decorator.beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend";
	}

	@Override
	public String getDescription() {
		return "House Blend";
	}

	@Override
	public double cost() {
		return 4000;
	}
}
