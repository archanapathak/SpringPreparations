package com.Archana.SpringcoreLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AbstractApplicationContext context = new 
//		ClassPathXmlApplicationContext("com\\Archana\\SpringcoreLifecycle\\lifecycleconfig.xml");
//		Pendrive pendrive1 = (Pendrive)context.getBean("pendrive1");
//		System.out.println(pendrive1);
//		
//		context.registerShutdownHook();
//		
//		System.out.println("+++++++++++++++++++++++++++");
//		
//		Usbport usbport = (Usbport)context.getBean("usbport1");
//		System.out.println(usbport);
//		
//		context.registerShutdownHook();
		
		
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("com\\Archana\\SpringcoreLifecycle\\lifecycleconfig.xml");
		
		Harddisk harddisk1 = (Harddisk) context.getBean("harddisk1");
		System.out.println(harddisk1);
		
		context.registerShutdownHook();
	}

}
