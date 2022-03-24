package StepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Hooksfetaures", 
glue= {"StepForHooks"},
plugin= {"pretty", "junit:target/xmlreports/testRunnerforhooks.xml",
		"json:target/jsonreports/testRunnerforhooks.json",
		"html:target/HtmlReports/testRunnerforhooks"})
public class TestRunnerForHooks {

	
}
