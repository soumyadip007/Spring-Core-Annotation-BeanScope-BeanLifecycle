package com.udemy.constructor_injection;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Learn Helicopter Shot";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

	


}
