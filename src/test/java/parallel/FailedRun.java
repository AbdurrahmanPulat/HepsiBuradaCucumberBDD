package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	,
				"rerun:target/failedrerun.txt"
		},
		features = {"src/test/resources/failedrerun.txt"},
		glue = {"parallel"},
		monochrome = true
		
		
		
		)

public class FailedRun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object [] [] scenarios(){
		return super.scenarios();
	}

}
