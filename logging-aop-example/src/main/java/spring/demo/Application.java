package spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.demo.aop.StringModifier;

public class Application {

	public static void main(String[] args) {
	
		Logger logger = LoggerFactory.getLogger(Application.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StringModifier modifier = context.getBean(StringModifier.class);
		String ourString = "There was an old man and he was just pacing around in the park";
		String modifiedString = modifier.replaceAllA(ourString);
		
		logger.debug("debug message from main:{}", modifiedString);
		context.close();
	}
} 




