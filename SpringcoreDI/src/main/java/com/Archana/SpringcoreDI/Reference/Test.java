package com.Archana.SpringcoreDI.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context = 	
			new ClassPathXmlApplicationContext("com\\Archana\\SpringcoreDI\\Reference\\refconfig.xml");

	A aobj = (A) context.getBean("Aref");
	
	System.out.println(aobj.getX());
	
	System.out.println(aobj.getB().getY());
	}

}
