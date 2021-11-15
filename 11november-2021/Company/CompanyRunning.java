package com.patternprogramme.star.one;

public class CompanyRunning {
public static void main(String[] args) {
	Company com=new Company(100);
	new Trainee(com,80).start();
	new Trainee(com,50).start();
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	new Requirter(com,60).start();
}
}
