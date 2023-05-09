package com.codys.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {
	
	public void up() {
		System.out.println("pacman up");
	}
	public void down() {
		System.out.println("pacman down");
	}
	public void left() {
		System.out.println("pacman left");
	}
	public void right() {
		System.out.println("pacman right");
	}
}
