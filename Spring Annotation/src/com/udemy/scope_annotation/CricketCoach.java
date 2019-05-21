package com.udemy.scope_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("scopePrototype")
@Scope("prototype")
public class CricketCoach implements Coach {


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Learn Helicopter Shot";
	}



}
