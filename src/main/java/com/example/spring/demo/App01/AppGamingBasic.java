package com.example.spring.demo.App01;

import com.example.spring.demo.game.GameRunner;
import com.example.spring.demo.game.GamingConsole;
import com.example.spring.demo.game.PackmanGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		GamingConsole game = new PackmanGame();
		GameRunner runner = new GameRunner(game);
		
		runner.run();
		
	}
}
