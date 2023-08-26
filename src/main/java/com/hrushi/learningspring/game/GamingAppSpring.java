package com.hrushi.learningspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hrushi.learningspring.game")
public class GamingAppSpring {

	public static void main(String[] args) {
		try(
				var context = 
				new AnnotationConfigApplicationContext(GamingAppSpring.class);
			){
			
			context.getBean(GameRunner.class).run();
		}
		
	}
	
}
