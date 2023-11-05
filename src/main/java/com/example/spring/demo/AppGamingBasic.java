package com.example.spring.demo;

import com.example.spring.demo.game.GameRunner;
import com.example.spring.demo.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		
		runner.run();
		
	}
}
