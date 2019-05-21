package com.udemy.springannotation;

import org.springframework.stereotype.Component;

@Component
public class DefaultComponents implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Default Annotation is here";
	}
}
