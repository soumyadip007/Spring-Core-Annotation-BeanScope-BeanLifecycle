package com.udemy.springConfigWithoutXml;


public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach (FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim 100 mtr. as warmup";
	}
	
	
		public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}

}
