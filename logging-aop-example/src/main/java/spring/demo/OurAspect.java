package spring.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OurAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(OurAspect.class);
	@Pointcut("execution(* spring.demo.aop.*.*(..))")
	public void doPointCut() {
	}

	/*
	 * @Before("doPointCut()") public void logSomethingBefore() {
	 * System.out.println("Method execution starting"); }
	 * 
	 * @After("doPointCut()") public void logSomethingAfter() {
	 * System.out.println("Method execution finished"); }
	 */

	@Around("doPointCut()")
	public String logEventAround(ProceedingJoinPoint joinPoint) throws Throwable {
		LOGGER.info("Reached to the join point");
		String s = (String) joinPoint.proceed();
		s = "What a powerful tool AOP is";
		return s;
	}

}
