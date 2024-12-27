package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"StepDefintions", "MyHooks"},
		plugin = {"pretty","html:target/alekhya.html"}
		)

public class Runner {

}
