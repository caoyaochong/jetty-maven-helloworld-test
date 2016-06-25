package cn.edu.zju.cst.examples.observer.weatherStation.use.jdk;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	private float pressure;

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

}
