package StepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/BackGroundDemo/", 
glue= {"stepsForBackGround"},
plugin= {"pretty",
		"json:target/cucumber-report/cucumber.json",
		"html:target/cucumber-report/cucumber.html"})
public class TestRunnerForBackGroundDemo {
	
}
