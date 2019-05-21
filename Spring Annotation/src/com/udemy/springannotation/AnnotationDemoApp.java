package com.udemy.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read Spring Config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
		//Get the bean
		Coach obj = context.getBean("thatSillyCoach", Coach.class);
		
		//Call Method on the bean
		System.out.println(obj.getDailyWorkout());
		
		
		//Close the context
		context.close();
	}

}
