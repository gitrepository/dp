package com.ch02;

public class zClient {

	public static void main(String[] args) {
		WeatherData s = new WeatherData();
		CurrentConditionsDisplay oCurr = new CurrentConditionsDisplay(s);
		ForecastDisplay oFore = new ForecastDisplay(s);
		StatisticsDisplay oStat = new StatisticsDisplay(s);

		System.out.println("###-###");
		s.setMeasurements(10, 20, 30);
		System.out.println("###-###");
		s.setMeasurements(20, 50, 80);
		System.out.println("###-###");
		s.removeObserver(oStat);
		s.setMeasurements(30, 40, 60);
	}
}