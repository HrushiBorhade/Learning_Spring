package com.hrushi.learningspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hrushi.learningspring.game.GameRunner;
import com.hrushi.learningspring.game.GamingConsole;
import com.hrushi.learningspring.game.PacManGame;

@Configuration
public class App3Configuration {
	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
}
