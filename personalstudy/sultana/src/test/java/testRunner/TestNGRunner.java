package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features",
		glue={"stepdef"},
		plugin= "pretty"
		)





public class TestNGRunner extends AbstractTestNGCucumberTests {

}
