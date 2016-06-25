package cn.edu.zju.cst.examples.design.pattern.observer.weatherStation;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
