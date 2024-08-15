package decorator.condiment;

import decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage { 	// 첨가물
	Beverage beverage;

	public abstract String getDescription();
}
