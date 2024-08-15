package observer.observer;

public class ForecastDisplay implements Observer, Display {
	public float temperature;
	public float humidity;
	public float pressure;

	public ForecastDisplay() {
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println();
		System.out.println("Forecast Display");
		System.out.println("Temperature: " + temperature);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);
		System.out.println();
	}
}
