package cn.edu.zju.cst.examples.observer.weatherStation;

public class CurrentConditionsDisplay implements Observer {
	private float temp; 
	private float humidity;
	private float pressure;

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	private void display() {
		System.out.println("temp = " + temp + "\nhumidity = " + humidity + "\npressure = " + pressure);
		
	}

}
