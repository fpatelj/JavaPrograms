package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

	@Value("1010")
	private int id;
	
	@Autowired
	private ClassA a;

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
