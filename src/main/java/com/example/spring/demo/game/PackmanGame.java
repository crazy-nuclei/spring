package com.example.spring.demo.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole {
	
	public void up() {
		System.out.println("Packman up");
	}
	
	public void down() {
		System.out.println("Packman down");
	}
	
	public void left() {
		System.out.println("Packman left");
	}
	
	public void right() {
		System.out.println("Packman right");
	}
}
