package com.hyoseop.jan051.main;

import java.math.BigDecimal;

public class Weather {
	int no;
	String name;
	BigDecimal temp;
	BigDecimal pressure;
	BigDecimal humidity;
	
	public Weather() {
		// TODO Auto-generated constructor stub
	}

	public Weather(int no, String name, BigDecimal temp, BigDecimal pressure, BigDecimal humidity) {
		super();
		this.no = no;
		this.name = name;
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTemp() {
		return temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}

	public BigDecimal getPressure() {
		return pressure;
	}

	public void setPressure(BigDecimal pressure) {
		this.pressure = pressure;
	}

	public BigDecimal getHumidity() {
		return humidity;
	}

	public void setHumidity(BigDecimal humidity) {
		this.humidity = humidity;
	}
	
}
