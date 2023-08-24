package com.hrushi.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hrushi.learningspring.game.GameRunner;

public class App3Spring {
	public static void main(String[] args) {
		try(
				var context = 
				new AnnotationConfigApplicationContext(App3Configuration.class);
			){
			
			context.getBean(GameRunner.class).run();
		}
		
	}
	
}
