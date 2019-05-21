package com.udemy.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("setterMatch")
public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;

	//No Arg Constructor
	public CricketCoach () {
		System.out.println("Inside Default constructor");
	}
	
	
	//Defining Setter Method
	@Autowired
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("Inside fortuneService");
		this.fortuneService=fortuneService;
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
