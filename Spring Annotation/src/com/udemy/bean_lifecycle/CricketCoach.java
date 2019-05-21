package com.udemy.bean_lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("setterMatch")
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	//No Arg Constructor
	public CricketCoach () {
		System.out.println("Inside Default constructor");
	}
	
	


	@Override
	public String getDailyWorkout() {

		return "Learn Helicopter Shot";
	}

	@Override
	public String getDailyFortune() {
	
		fortuneService.methodInjection();
		
		return (fortuneService.getFortuneService());
	}

	

}
