package com.udemy.bean_lifecycle;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {


	@Override
	public String getFortuneService() {
		
		return "Autowiring Applied with field injection //HappyFortuneService";
	}

	@Override
	public void methodInjection() {
		
		System.out.println("Executing Method injection with fieldinjection");
	}

}
