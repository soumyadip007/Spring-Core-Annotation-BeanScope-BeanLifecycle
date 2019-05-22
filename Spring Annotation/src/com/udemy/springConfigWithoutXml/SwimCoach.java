package com.udemy.springConfigWithoutXml;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach (FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		System.out.println(email+"  "+team);
		return "Swim 100 mtr. as warmup";
	}
	
	
		public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}

}
