package com.hyoseop.jan051.main;

import java.util.ArrayList;

public class controlWeather {
	public static void main(String[] args) {
		ArrayList<Weather> w = new ArrayList<Weather>();
		w = WeatherDAO.getWeather();
		for (Weather weather : w) {
			System.out.println(weather.getName());
			System.out.println(weather.getTemp());
			System.out.println(weather.getPressure());
			System.out.println(weather.getHumidity());
			WeatherDAO.writeWeather(weather);
		}
	}
}
