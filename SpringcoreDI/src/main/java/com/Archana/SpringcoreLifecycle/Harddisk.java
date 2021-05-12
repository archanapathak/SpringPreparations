package com.Archana.SpringcoreLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Harddisk {
	
	public String Brand;

	public Harddisk(String brand) {
		super();
		Brand = brand;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public Harddisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Harddisk [Brand=" + Brand + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("ending method");
	}
	

}
