package com.technoelevate.casestudy.hibernate.springprogrames.beans;

public class Vehicle {
private Wheel wheel;
private Engine engine;

/*
 * public Wheel getWheel() { return wheel; } public void setWheel(Wheel wheel) {
 * this.wheel = wheel; } public Engine getEngine() { return engine; } public
 * void setEngine(Engine engine) { this.engine = engine; }
 */

@Override
public String toString() {
	return "Vehicle [wheel=" + wheel + ", engine=" + engine + "]";
}

public Vehicle(Wheel wheel, Engine engine) {
	super();
	this.wheel = wheel;
	this.engine = engine;
}
}
