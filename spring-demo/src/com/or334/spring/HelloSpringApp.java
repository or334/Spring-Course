package com.or334.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods of bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
