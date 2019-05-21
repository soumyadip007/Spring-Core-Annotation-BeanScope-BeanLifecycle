package com.udemy.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {


	@Override
	public String getFortuneService() {
		
		return "Autowiring Applied";
	}

}
