package App02;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean(String.class));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
	}
}
