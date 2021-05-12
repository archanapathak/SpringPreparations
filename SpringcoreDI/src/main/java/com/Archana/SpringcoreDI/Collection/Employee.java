package com.Archana.SpringcoreDI.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String employname;
	private  List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	public String getEmployname() {
		return employname;
	}
	public void setEmployname(String employname) {
		this.employname = employname;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employname, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.employname = employname;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [employname=" + employname + ", phones=" + phones + ", addresses=" + addresses + ", courses="
				+ courses + "]";
	}
	
	
	
	

}
