package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/Ona/git/CakapSelenium/BDDSelenium/src/main/java/features/ArrayInspection.feature", 
			glue={"stepDefinition"} 		
			)

public class TestRunner {

}

	
	