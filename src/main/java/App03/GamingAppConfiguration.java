package App03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring.demo.game.GameRunner;
import com.example.spring.demo.game.GamingConsole;
import com.example.spring.demo.game.PackmanGame;

@Configuration
public class GamingAppConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PackmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
