package com.udemy.bean_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	//Add an Init-Method
	@PostConstruct
	public void doMyStartupStuff() {
		// TODO Auto-generated method stub
		System.out.println("Trackcoach : Executing Init-Method @PostConstruct");
	}
	
	
	//Add an destroy method
	@PreDestroy
	public void destroyMyStartupStuff() {
		// TODO Auto-generated method stub
		System.out.println("Trackcoach : Executing Destroy-Method @PreDestroy");
	}
}


/*
 O/P
 
 Inside Default constructor
Trackcoach : Executing Init-Method @PostConstruct
Learn Helicopter Shot
Executing Method injection with fieldinjection
Autowiring Applied with field injection //HappyFortuneService
Trackcoach : Executing Destroy-Method @PreDestroy

 */
