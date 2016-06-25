package cn.edu.zju.cst.examples.observer.weatherStation;

public interface Observer {
	public  void update(float temp, float humidity, float pressure);
}
