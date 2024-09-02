import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;
import factory.factory.NYPizzaStore;
import observer.observer.ConcurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.WeatherData;
import strategy.duck.MallardDuck;
import strategy.duck.RedHeadDuck;
import strategy.duck.RubberDuck;

public class Main {
	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
	}
}