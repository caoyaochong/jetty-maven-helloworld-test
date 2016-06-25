package cn.edu.zju.cst.examples.design.pattern.observer.weatherStation;

public interface Observer {
	public  void update(float temp, float humidity, float pressure);
}
