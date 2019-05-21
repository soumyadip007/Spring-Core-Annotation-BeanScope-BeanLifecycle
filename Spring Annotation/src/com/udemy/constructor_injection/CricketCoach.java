package com.udemy.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("ConstructorMatch")
public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;

	@Autowired
	public CricketCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		}

	@Override
	public String getDailyWorkout() {

		return "Learn Helicopter Shot";
	}

	@Override
	public String getDailyFortune() {
		
		return (fortuneService.getFortuneService());
	}

	


}
