package App09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class A {

	public A() {
		super();
		System.out.println("A object contructor");
	}
	
	@PostConstruct
	void initialise() {
		System.out.println("Initialisation our object");
	}
	
	@PreDestroy
	void destory() {
		System.out.println("This object is getting destroyed");
	}
	
}

@Configuration
@ComponentScan
public class PostConstructPreDestroy {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(PostConstructPreDestroy.class)){
			
			context.getBean(A.class);
		}
	}

}
