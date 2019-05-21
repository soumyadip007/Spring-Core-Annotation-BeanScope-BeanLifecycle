package com.udemy.springConfigWithoutXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

public static void main(String[] args) {
		
		//read Spring Config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);

		
		
		//Get the bean
		Coach obj = context.getBean("configCoach", Coach.class);

		
		//Check result
		System.out.println(obj.getDailyWorkout());
				
		//Close the context
				
		context.close();
	}

}
