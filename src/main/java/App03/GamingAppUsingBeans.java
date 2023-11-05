package App03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.demo.game.GameRunner;
import com.example.spring.demo.game.GamingConsole;

public class GamingAppUsingBeans {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(GamingAppConfiguration.class)){
			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}
	}
}
