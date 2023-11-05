package App02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address ) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("AA", 20, new Address("nyc", "york"));
	}
	
	@Bean(name="person2")
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean(name="person3")
	public Person person3Parameters(String name, int age, @Qualifier("Add") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name="address2")
	@Qualifier("Add")
	public Address addressWithNewName() {
		return new Address("VDN", "JAI");
	}
	
}
