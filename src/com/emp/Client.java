package com.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//Create a Spring container based on beans.xml configuration file
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		Employee emp1 = context.getBean("e4",Employee.class);
//		Employee emp2 = context.getBean("e2",Employee.class);
//		if(emp1 == emp2) {
//			System.out.println("Both reference are pointing to the same object on heap");
//		}else {
//			System.out.println("Two difference objects are created");
//		}
		
//		Address addr = context.getBean("addr",Address.class);
		
//		System.out.println(addr);
		System.out.println("Emp1 is ----> " + emp1);
		
		
		//Close method is not available on Application Context, Hence, we have to type cast it.
		ConfigurableApplicationContext configCtx = (ConfigurableApplicationContext) context;
		configCtx.close();  // this will invoke the method that we set in property destroy-method of beans.xml 
		
		
	}

}
