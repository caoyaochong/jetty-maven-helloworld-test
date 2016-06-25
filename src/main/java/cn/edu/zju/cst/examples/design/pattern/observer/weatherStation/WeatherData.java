package cn.edu.zju.cst.examples.design.pattern.observer.weatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	
	private float temp; 
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(temp, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay();
		weatherData.registerObserver(currentConditionsDisplay);
		weatherData.registerObserver(currentConditionsDisplay2);
		weatherData.setMeasurements(1, 2, 3);
		weatherData.notifyObservers();
		weatherData.setMeasurements(13, 32, 33);
		weatherData.removeObserver(currentConditionsDisplay2);
		weatherData.notifyObservers();
	}

}
