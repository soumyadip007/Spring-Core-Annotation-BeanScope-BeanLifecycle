package com.udemy.field_injection;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Autowiring Applied with field injection //DatabaseFortuneService";
	}

	@Override
	public void methodInjection() {
		// TODO Auto-generated method stub

	}

}
