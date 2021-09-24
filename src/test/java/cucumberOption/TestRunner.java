package cucumberOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",				//path for feature file	
		glue="stepDefinition", stepNotifications = true,	//glue = package name
		tags="@SmokeTest")
public class TestRunner {

}


// Junit Test Runner