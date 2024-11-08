package runners;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    //features = "src/test/java/features",
		features = "src/test/java/features/UserRegistration.feature ,src/test/java/features/UserLogin.feature",
				
    glue = "stepDefinitions",
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports"}
  
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	    
}





