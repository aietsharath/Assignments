package com.patternprogramme.star.one;
public class Company {
int job;
public Company(int job) {
	super();
	this.job = job;
}
public synchronized void Requirted(int noOfEmployee) {
	job+=noOfEmployee;
	System.out.println("Requirted employee succusfully");
System.out.println("Avalible jobs="+job);
this.notify();
}
public synchronized void Vaccancy(int noOfEmployee) {
	while(noOfEmployee>job) {
		System.out.println("There is no vaccancy now please wait for some time let you know by mail");
	try {
		this.wait();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
	job-=noOfEmployee;
	System.out.println("Requirted succusfully\n Available vaccancy ="+job);
}
}
