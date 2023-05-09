package com.codys.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codys.spring.learnspringframework.game.GameRunner;
import com.codys.spring.learnspringframework.game.GamingConsole;
import com.codys.spring.learnspringframework.game.MarioGame;
import com.codys.spring.learnspringframework.game.PacmanGame;
import com.codys.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		
		GamingConsole game=  new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
