package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\Mobile Programming\\eclipse-workspace\\ShikhaCucumber\\Features\\login.feature", 
glue="StepDefinition",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-ouput"})


public class TestRun {

}
