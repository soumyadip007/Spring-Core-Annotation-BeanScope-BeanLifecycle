package com.udemy.springConfigWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.udemy.springConfigWithoutXml")
public class SpringConfig {

	
	//Define bean for sad fortune service 
	
	@Bean
	public FortuneService SadFortuneService()
	{
		return new SadFortuneService();
		
	}
	
	@Bean
	public Coach SwimCoach()
	{
		return new SwimCoach(SadFortuneService());
	}
	
	
}
