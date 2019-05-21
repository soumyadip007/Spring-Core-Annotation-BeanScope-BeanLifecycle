package com.udemy.scope_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("ScopePrototype")
public class CricketCoach implements Coach {


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Learn Helicopter Shot";
	}



}
