package decorator.condiment;

import decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", whipping cream";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1000;
	}
}
