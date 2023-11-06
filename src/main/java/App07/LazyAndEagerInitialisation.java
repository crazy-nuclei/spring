package App07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A {}

@Component
@Lazy
class B {
	A a;

	public B(A a) {
		super();
		this.a = a;
		System.out.println("Class B initialised");
	}
}

@Component
class C {
	A a;

	public C(A a) {
		super();
		this.a = a;
		System.out.println("Class C initialised");
	}
}

@Configuration
@ComponentScan
public class LazyAndEagerInitialisation {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(LazyAndEagerInitialisation.class)){
			
			System.out.println("Class B will only get initialized when we will use it");
			context.getBean(B.class);
		}
		
	}

}
