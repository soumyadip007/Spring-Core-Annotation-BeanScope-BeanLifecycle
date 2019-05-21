package com.udemy.field_injection;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Autowiring Applied with field injection //RandomFortuneService";
	}

	@Override
	public void methodInjection() {
		
	}


}
