package com.Archana.SpringcoreDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext context =   new ClassPathXmlApplicationContext("config.xml");
      Student stud1 = (Student) context.getBean("studobj3");
      
      System.out.println(stud1);
      
      Student stud2 = (Student) context.getBean("studobj4");
      
      System.out.println(stud2);
    }
}
