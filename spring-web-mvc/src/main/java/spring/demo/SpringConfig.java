package spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("spring.demo")
public class SpringConfig {

	@Bean
	@Lazy
	public ClassA classA() {
		return new ClassA();
	}

	@Bean(name = "ourBestBean")
	@Scope("prototype")
	@Lazy
	public ClassB classB() {
		return new ClassB();
	}

	@Bean(name = "ourBetterBean")
	// @Scope("singleton")
	@Lazy
	public ClassB classBAnotherBean() {
		return new ClassB();
	}
}
