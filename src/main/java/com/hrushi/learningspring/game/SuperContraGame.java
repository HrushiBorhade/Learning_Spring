package com.hrushi.learningspring.game;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
	
		
		public void up() {
			System.out.println("Up");
		}
		public void down() {
			System.out.println("Sit");
		}
		public void left() {
			System.out.println("Go Back");
		}
		public void right() {
			System.out.println("Shoot!");
		}


	

}
