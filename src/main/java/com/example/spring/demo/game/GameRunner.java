package com.example.spring.demo.game;

public class GameRunner {
	
	public MarioGame game;

	public GameRunner(MarioGame game) {
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