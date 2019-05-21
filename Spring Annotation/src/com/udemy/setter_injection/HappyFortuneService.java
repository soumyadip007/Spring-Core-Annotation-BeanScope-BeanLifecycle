package com.udemy.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {


	@Override
	public String getFortuneService() {
		
		return "Autowiring Applied";
	}

	@Override
	public void methodInjection() {
		
		System.out.println("Executing Method injection");
	}

}
