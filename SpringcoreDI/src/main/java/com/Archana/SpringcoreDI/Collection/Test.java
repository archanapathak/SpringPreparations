package com.Archana.SpringcoreDI.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context = 	new ClassPathXmlApplicationContext("com\\Archana\\SpringcoreDI\\Collection\\EmpConfig.xml");
	
 Employee emp1 = (Employee) context.getBean("empobj1");
 
 System.out.println(emp1);
	}

}
