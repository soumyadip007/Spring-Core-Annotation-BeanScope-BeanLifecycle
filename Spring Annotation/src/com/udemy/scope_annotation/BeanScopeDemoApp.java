package com.udemy.scope_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
public static void main(String[] args) {
		
		//read Spring Config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
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

/*

Output  (Singleton or Default):

Both objects are same = true

Memory allocation for obj is = com.udemy.scope_annotation.CricketCoach@71a794e5

Memory allocation for obj1 is = com.udemy.scope_annotation.CricketCoach@71a794e5



Output  (Prototype or Default):


Both objects are same = false

Memory allocation for obj is = com.udemy.scope_annotation.CricketCoach@3ffcd140

Memory allocation for obj1 is = com.udemy.scope_annotation.CricketCoach@23bb8443

*/