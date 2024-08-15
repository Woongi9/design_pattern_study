package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public class WeatherData implements Subject {

	List<Observer> observers = new ArrayList<>();
	float temperature;
	float humidity;
	float pressure;

	public WeatherData() {}

	public float getTemperature() {
		return 32;
	}

	public float getHumidity() {
		return 50;
	}

	public float getPressure() {
		return 29;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements() {
		this.temperature = getTemperature();
		this.humidity = getHumidity();
		this.pressure = getPressure();
		System.out.println();
		measurementsChanged();
	}
}
