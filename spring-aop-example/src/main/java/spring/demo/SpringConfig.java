package spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.*")
@EnableAspectJAutoProxy
public class SpringConfig {

	
}
