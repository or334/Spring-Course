package com.or334.spring;

public class BaseballCoach implements Coach {
	
	//define a private variable
	private FortuneService fortuneService;
	
	//Create dependency constractor
	public BaseballCoach (HappyFortuneService happyFortuneService) {
		this.fortuneService = happyFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
