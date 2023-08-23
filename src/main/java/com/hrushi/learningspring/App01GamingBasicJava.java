package com.hrushi.learningspring;

import com.hrushi.learningspring.game.GameRunner;
import com.hrushi.learningspring.game.MarioGame;
import com.hrushi.learningspring.game.SuperContraGame;
import com.hrushi.learningspring.game.PacManGame;


public class App01GamingBasicJava {
	//Right now GameRunner Class is tightly coupled to game e.g - mario,supercontra etc.
	public static void main(String[] args) {
		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacManGame();

		var gameRunner1 = new GameRunner(game1);
		var gameRunner2 = new GameRunner(game2);
		var gameRunner3 = new GameRunner(game3);

		gameRunner1.run();	
		System.out.println("-----------------");
		gameRunner2.run();
		System.out.println("-----------------");
		gameRunner3.run();

		

	}
}
