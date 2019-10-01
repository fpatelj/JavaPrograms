package spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/*@Component*/
public class ClassA {
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of class A gets called");
	}

	@PreDestroy
	public void predestroy()
	{
		System.out.println("Destroy method of class A gets called");
	}
	
	public String doSomething()
	{
		return "Hello Spring World!";
	}
}
