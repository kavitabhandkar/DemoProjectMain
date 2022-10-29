package Demo1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/test/resources/Demo1/Scenario1/"},
			glue={"Demo1/Scenario1StepDef/"},
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html" 
					}
			)
public class RunDemoProject {

}
