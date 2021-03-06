package spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		/*
		 * ClassB b = new ClassB();
		 *  ClassA a = new ClassA(); b.setA(a);
		 * System.out.println(b.getA().doSomething()); }
		 */

	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		//ClassB b1 = context.getBean(ClassB.class);
		
		System.out.println("Application context is loaded");
	
	   // ClassB b1 = (ClassB) context.getBean("ourBetterBean");
		//System.out.println(b1.getId());
		
		/*
		 * 
		 * 
		 * ClassB b2 = context.getBean(ClassB.class); b2.setId(2020);
		 * System.out.println(b2.getId());
		 * 
		 * System.out.println(b1.getId());
		 */
		
		((AnnotationConfigApplicationContext)context).close();
	}
} 




