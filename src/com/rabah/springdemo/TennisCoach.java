package com.rabah.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	

	public TennisCoach() {
		System.out.println("Inside TennisCoach no-args constructor");
	}
	
	

	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
    */


	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

/*


    @Autowired
	public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
*/


	@Override
	public String getDaylyFortune() {
		
		return fortuneService.getFortune();
	}

}
