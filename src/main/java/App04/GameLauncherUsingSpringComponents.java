package App04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring.demo.game.GameRunner;

@Configuration
@ComponentScan("com.example.spring.demo.game")
public class GameLauncherUsingSpringComponents {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GameLauncherUsingSpringComponents.class)){
			
			context.getBean(GameRunner.class).run();
		}
	}
}
