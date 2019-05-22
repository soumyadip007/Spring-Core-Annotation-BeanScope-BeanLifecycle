package com.udemy.springConfigWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.udemy.springConfigWithoutXml")
@PropertySource("classpath:sports.properties")
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
