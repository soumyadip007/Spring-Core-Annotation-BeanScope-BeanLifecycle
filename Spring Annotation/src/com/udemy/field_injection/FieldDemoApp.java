package com.udemy.field_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldDemoApp {


	public static void main(String[] args) {

		//read Spring Config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		
		//Get the bean
		Coach obj = context.getBean("setterMatch", Coach.class);

		//Call Method on the bean
		System.out.println(obj.getDailyWorkout());
		

		System.out.println(obj.getDailyFortune());
		
		//Close the context
		context.close();
	}

}
