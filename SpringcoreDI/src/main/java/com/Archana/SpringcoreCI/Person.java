package com.Archana.SpringcoreCI;

public class Person {

	private String name;
	private int personid;
	
	private Certificate cert;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int personid , Certificate cert) {
		super();
		this.name = name;
		this.personid = personid;
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + "{" + this.cert.name + "} ]";
	}
	
	
}
