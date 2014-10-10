package com.ch02;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

	private List<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}

	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(IObserver o :observers){
			if(o != null){
				o.update(temperature, humidity, pressure);
			}
		}
	}

	public void measurementChanged(){
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
