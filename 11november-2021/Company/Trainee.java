package com.patternprogramme.star.one;

public class Trainee extends Thread{
Company com;
int noOfEmployee;
public Trainee(Company com, int noOfEmployee) {
	super();
	this.com = com;
	this.noOfEmployee = noOfEmployee;
}

public void run() {
	com.Vaccancy(noOfEmployee);
}
}
