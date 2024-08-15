import observer.observer.ConcurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.WeatherData;
import strategy.duck.MallardDuck;
import strategy.duck.RedHeadDuck;
import strategy.duck.RubberDuck;

public class Main {
	public static void main(String[] args) {
		System.out.println("---- WeatherData 최신 업데이트 ------");
		WeatherData weatherData = new WeatherData();
		weatherData.registerObserver(new ConcurrentConditionsDisplay());
		weatherData.registerObserver(new ForecastDisplay());
		weatherData.registerObserver(new StatisticsDisplay());

		weatherData.setMeasurements();
	}
}