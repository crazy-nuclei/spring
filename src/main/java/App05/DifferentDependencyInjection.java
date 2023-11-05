package App05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Dep1 {}

@Component
class Dep2 {}

@Component
class App {
	
//	@Autowired		FIELD BASED DEPENDENCY INJECTION (USING REFLECTION)
//	Dep1 dep1;
//	@Autowired
//	Dep2 dep2;
	
	Dep1 dep1;
	Dep2 dep2;
	
	
//	@Autowired							SETTER BASED DEPENDENCY INJECTION
//	public void setDep1(Dep1 dep1) {
//		this.dep1 = dep1;
//	}
//	
//	@Autowired
//	public void setDep2(Dep2 dep2) {
//		this.dep2 = dep2;
//	}

	
//											CONSTRUCTOR BASED (Recommended)
	public App(Dep1 dep1, Dep2 dep2) {	
		super();
		this.dep1 = dep1;
		this.dep2 = dep2;
	}

	@Override
	public String toString() {
		return "App [dep1=" + dep1 + ", dep2=" + dep2 + "]";
	}
}

@Configuration
@ComponentScan
public class DifferentDependencyInjection {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DifferentDependencyInjection.class)){
			
			System.out.println(context.getBean(App.class).toString());
			
		}
		
	}

}
