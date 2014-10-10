package com.ch02;


public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
	private float temperature;
	private float humidity;
	private ISubject s;


	public CurrentConditionsDisplay(ISubject s) {
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
		System.out.println("Current Conditions - Temperature: "+temperature+" * Humidity: "+humidity);
	}

}
