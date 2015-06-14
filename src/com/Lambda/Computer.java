package com.Lambda;

public class Computer {
	private String name;
	private Integer year;
	
	public Computer(String name, Integer year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public Double getPlusSix(Double x){
		return x + 6;
	}
	
	
}
