package cucumber_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {""},
        glue = {"hooks", "stepDefs"}
)

public class TestRunner {
}
