package com.technoelevate.casestudy.hibernate.springprogrames.beans;

public class Engine {
long ccnumber;

/*
 * public long getCcnumber() { return ccnumber; }
 * 
 * public void setCcnumber(long ccnumber) { this.ccnumber = ccnumber; }
 */

@Override
public String toString() {
	return "Engine [ccnumber=" + ccnumber + "]";
}

public Engine(long ccnumber) {
	super();
	this.ccnumber = ccnumber;
}
}