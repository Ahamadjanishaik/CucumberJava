package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "C:\\Users\\janus\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\TestNG_Cucumber\\src\\test\\java\\steps_testng\\SecondOpinion_steps.java",
		glue="steps_testng"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}

