package com.lti.GitDemo;
import java.util.List;

import com.lti.GitDemo.Address;

public class db {
private int rno;
private String name;
private List<Address> laddress;
public db() {
	
}
public db(int rno, String name, List<Address> laddress) {
	super();
	this.rno = rno;
	this.name = name;
	this.laddress = laddress;
}
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<Address> getLaddress() {
	return laddress;
}
public void setLaddress(List<Address> laddress) {
	this.laddress = laddress;
}
public void display() {
	System.out.println("Registration number\t: "+this.rno + "\nName\t : " + this.name);
	for(Address a : laddress) {
	 System.out.println("\nAddress : \n"+ a);
	}
	}
}
