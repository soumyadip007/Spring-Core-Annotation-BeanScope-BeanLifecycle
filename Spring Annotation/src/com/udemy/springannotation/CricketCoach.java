package com.udemy.springannotation;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Learn Helicopter Shot";
	}

	


}
