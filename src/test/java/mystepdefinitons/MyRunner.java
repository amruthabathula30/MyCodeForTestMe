package mystepdefinitons;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\Cucum\\myfeatures\\tags.feature",glue="mystepdefinitions",tags= {"@Regression"})

public class MyRunner {

}
