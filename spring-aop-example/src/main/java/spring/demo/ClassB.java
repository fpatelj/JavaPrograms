package spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Value;


public class ClassB {

	@Value("1010")
	private int id;
	
	@Inject
	private ClassA a;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method of class B gets called");
	}
	
	@PreDestroy
	public void predestroy()
	{
		System.out.println("Destroy method of class B gets called");
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

}
