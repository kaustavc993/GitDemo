package cucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Account.feature",
glue = "stepDefinition",								
tags="@SmokeTest or @RegTest")	

/*
 * tags="not @SanityTest"
 * tags="@RegTest"
 * tags="@SmokeTest or @RegTest"
 * tags="@SmokeTest and @RegTest"
 */

public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
