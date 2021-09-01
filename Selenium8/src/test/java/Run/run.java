package Run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="BDD\\Features", glue="BDD\\src\\test\\java\\step")
public class run extends AbstractTestNGCucumberTests {

}
