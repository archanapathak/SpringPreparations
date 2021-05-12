package com.Archana.SpringcoreDI;

public class Student {
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", address=" + address + ", id=" + id + "]";
	}
	private String Name;
	private String address;
	private int id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, int id) {
		super();
		Name = name;
		this.address = address;
		this.id = id;
	}
	
	

}
