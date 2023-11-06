package App08;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class A {}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class B {}

@Configuration
@ComponentScan
public class BeanScopes {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanScopes.class)) {
			
			System.out.println(context.getBean(A.class));
			System.out.println(context.getBean(A.class));
			System.out.println(context.getBean(A.class));
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
			System.out.println(context.getBean(B.class));
			
		}
	}
}
