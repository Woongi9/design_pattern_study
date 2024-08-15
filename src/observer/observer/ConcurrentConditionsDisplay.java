package observer.observer;

public class ConcurrentConditionsDisplay implements Observer, Display {

	float temperature;
	float humidity;
	float pressure;

	public ConcurrentConditionsDisplay() {
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
		System.out.println("Concurrent Conditions Display");
		System.out.println("Temperature: " + temperature);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);
		System.out.println();
	}
}
