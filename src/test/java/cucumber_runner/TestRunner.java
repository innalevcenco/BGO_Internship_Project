package cucumber_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@test"},
//        plugin = {html: report/},
        glue = {"hooks", "steps"}
)

public class TestRunner {
}