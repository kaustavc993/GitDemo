package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {
	
	@Before("@MobileTest")
	public void beforeMobileValidation() {
		
	}
	@After("@MobileTest")
	public void afterMobileValidation() {
		
	}
	
	@Before("@WebTest")
	public void beforeWebValidation() {
		
	}
	@After("@WebTest")
	public void afterWebValidation() {
		
	}
}
//Do not use background with hooks