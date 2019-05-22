package com.udemy.springConfigWithoutXml;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Today is a sad day";
	}
 

}
