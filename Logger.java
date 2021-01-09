package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {

	@Before("execution(void main(String[]) )")
	public void beforeMain() {
		System.out.println("STARTING");
	}
	
	@After("execution(void main(String[]) )")
	public void afterMain() {
		System.out.println("ENDING");
	}
	
}
