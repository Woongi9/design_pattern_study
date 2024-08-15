import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;
import observer.observer.ConcurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.WeatherData;
import strategy.duck.MallardDuck;
import strategy.duck.RedHeadDuck;
import strategy.duck.RubberDuck;

public class Main {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Whip(espresso);
		System.out.println(espresso.getDescription() + " " + espresso.cost() + "원");

		Beverage beverage = new HouseBlend();
		beverage = new  Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " " + beverage.cost() + "원");
	}
}