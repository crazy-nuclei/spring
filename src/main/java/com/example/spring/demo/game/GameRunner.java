package com.example.spring.demo.game;

public class GameRunner {
	
	public GamingConsole game;

	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	} 
	
	public void run() {
		System.out.println("Running Game : " + this.game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
