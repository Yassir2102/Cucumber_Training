package modules;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin = {"pretty","json:target/json/results.json"},
        plugin = {"pretty","html:target/cucumber-reports"},
        features = {"src/test/resources/features"},
        glue = {"modules","step_definition"},
        tags = "@Google_search"

)
public class TestRunner {
    //TODO : Create test run configuration
}
