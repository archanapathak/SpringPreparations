package com.Archana.SpringcoreLifecycle;

public class Pendrive {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	public Pendrive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pendrive(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pendrive [price=" + price + "]";
	}
	
	public void Init() {
	System.out.println("inside init method");
	}
	
	public void Destroy() {
		System.out.println("inside destroy method");
	}

}
