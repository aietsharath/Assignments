package com.technoelevate.casestudy.hibernate.springprogrames.beans;

public class Wheel {
	int number;

	/*
	 * public int getNumber() { return number; }
	 * 
	 * public void setNumber(int number) { this.number = number; }
	 */
	
	@Override
	public String toString() {
		return "Wheel [number=" + number + "]";
	}

	public Wheel(int number) {
		super();
		this.number = number;
	}
}