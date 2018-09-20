package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Resources",
            glue = "StepDefinitions",
            tags= {"@test1"})
    public class RunnerClass {


    }

