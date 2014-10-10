package com.ch02;


public class ForecastDisplay implements IObserver, IDisplayElement {
	private float temperature;
	private float humidity;
	private ISubject s;


	public ForecastDisplay(ISubject s) {
		this.s = s;
		s.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast Conditions - Temperature: "+(temperature+10)+" * Humidity: "+(humidity+20));
	}

}
