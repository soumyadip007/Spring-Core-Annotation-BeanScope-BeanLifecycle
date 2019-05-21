package com.udemy.springConfigWithoutXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

public static void main(String[] args) {
		
		//read Spring Config
		
		
		//Get the bean
		Coach obj = context.getBean("scopePrototype", Coach.class);

		Coach obj1 = context.getBean("scopePrototype", Coach.class);
		
		
		//Check result
		boolean result= (obj==obj1);
		
		System.out.println("\nBoth objects are same = "+result);
		
		System.out.println("\nMemory allocation for obj is = "+obj);

		System.out.println("\nMemory allocation for obj1 is = "+obj1);
				
				
		//Close the context
				
		context.close();
	}

}
