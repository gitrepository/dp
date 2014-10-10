package com.ch02;


public class StatisticsDisplay implements IObserver, IDisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private ISubject s;


	public StatisticsDisplay(ISubject s) {
		this.s = s;
		s.registerObserver(this);
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
		System.out.println("Statistics - Avg Temperature: "+(temperature/2)+" * Avg Humidity: "+(humidity/2)+" Avg Pressure: "+(pressure/2));
	}

}
