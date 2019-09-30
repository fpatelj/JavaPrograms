package spring.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import spring.demo.OurAspect;

@Component
public class StringModifier {

	private static final Logger LOGGER = LoggerFactory.getLogger(StringModifier.class);
	public String replaceAllA(String replacee) {
		LOGGER.info("Given string is being replaced");
		return replacee.replace('a', 'A');
	}

}
